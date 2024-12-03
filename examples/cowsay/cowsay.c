#include <stdio.h>
#include <string.h>
#include <stdbool.h>
#include <stdlib.h>

int replace_tabs(char **rtext); 

char *text_in = "The BASIL tool generates semantically equivalent Boogie source files (.bpl) from AArch64/ARM64 binaries that have been lifted to intermediate formats. Supported input formats are BAP (Binary Analysis Platform) intermediate ADT format, and the .gts format produced by gtirb-semantics.";

#define MAX_SIZE 2048

char in_area[MAX_SIZE] = {};
char out_area[MAX_SIZE] = {};
char cow_area[MAX_SIZE] = {};


// Remove duplicate instances of <del> so that a maximum of 3 consecutive 
// remain
void strip_excess_char(char **text, char del) {
    int len = strlen(*text);
    int count = 0;

    do {

    char last_char = 'a';
    char llast_char = 'a';
    char this_char;
    count = 0;

        for (int i = 0; (*text)[i] != '\0'; i++) {
            this_char = (*text)[i];

            if (this_char == del && last_char == del && llast_char == del) {
                count++;

                if ((*text)[i+1] == '\0') {
                    /*(*text)[i-1] = '\0';*/
                    (*text)[i] = '\0';
                    break;
                }

                for (int j = i; (*text)[j] != '\0'; j++) {
                    /*(*text)[j-1] = (*text)[j];*/
                    /*(*text)[j] = (*text)[j+1];*/
                    (*text)[j] = (*text)[j+1];
                }

                //*text = reallocarray(*text, --len, sizeof(char));
            }
            llast_char = last_char;
            last_char = this_char;
        }
    } while (count > 0);
}

void strip_tailing_whitespace(char *text) {
    int len  = strlen(text);

    char *match = "\n\t ";

    for (int i = len-1; i > 0; i ++) {
        bool m = false;
        for (int j = 0; j < strlen(match); j++) {
            if (text[i] == match[j]) {
                text[i] = '\0';
                m = true;
                break;
            }
        }
        if (!m) {
            break;
        }
    }
}


void insert_char(char **str, char c, int p) {
    int len = strlen(*str);

    *str = reallocarray(*str, len + 3, sizeof(char));

    for (int i = len-1; i >= p; i--) {
        (*str)[i+1] = (*str)[i];
    }

    (*str)[p] = c;
}

// hard-warps string on spaces and long-lines to match width. 
// @param width: the maximum width of the resulting string. 
// @param text: The text to be wrapped. It is modified in place.
void wrap_text(char *text, int width) {

    char *last_break = NULL;
    int current_line = 1;
    int last_break_pos = 0;

    for (int i = 0; text[i] != '\0'; i++) {

        if (text[i] == '\n') {
            last_break = text + i;
            last_break_pos = current_line;
            current_line = 0;
        }

        // set whitespace to be break point
        if ((text[i] == ' ') && current_line <= width + 2) {
            last_break_pos = current_line;
            last_break = text + i;
        }

        // force break on long liness
        if ((current_line > width + 1) && last_break == NULL) {
            insert_char(&text, '\n', i-1);
            last_break = NULL;
            current_line = 0;
        } else if (current_line > width + 1) {
            // normal break
            *last_break = '\n';
            last_break = NULL;
            current_line = current_line - last_break_pos;
        } 

        current_line++;
    }
}

void print_bubble(char *text, int width, int line_count) {

    printf(" ");
    for (int i = 0; i < width + 3; i ++) {
        printf("_");
    }
    printf("\n");

    int lc = 0;
    int ll = 0;
    for (int i = 0; text[i] != '\0'; i++) {
//        printf("%d: %p = %c\n", i, text + i, text[i]);
        if (ll == 0) {
            if (lc == 0) {
                printf("/ ");
            } else if (lc == line_count) {
                printf("\\ ");
            } else {
                printf("| ");
            }
        }

        if (text[i] == '\n') {

            for (;ll <= width; ll++) {
                printf(" ");
            }

            if (lc == 0) {
                printf(" \\\n");
            } else if (lc == line_count) {
                printf(" /\n");
            } else {
                printf(" |\n");
            }

            ll = -1;
            lc++;
        } else {
            char toprint[2] = {text[i], '\0'};
            printf(toprint);
        }
        ll++;
    }

    for (;ll <= width; ll++) {
        printf(" ");
    }

    if (lc == 0) {
        printf(" \\\n");
    } else if (lc == line_count ) {
        printf(" /\n");
    } else if (lc == line_count ) {
        ;
    } else {
        printf(" |\n");
    }

    printf(" ");
    for (int i = 0; i < width + 3; i ++) {
        printf("-");
    }
}

void print_single_line_bubble(char *text, int len) {
    printf(" ");
    for (int i = 0; i < len + 1; i++) {
        printf("_");
    }

    printf("\n< ");
    printf(text);
    printf(" >\n");

    printf(" ");

    for (int i = 0; i < len + 1; i++) {
        printf("-");
    }
    printf("\n");

}

int replace_tabs(char **rtext) {
    char *text = *rtext;
    size_t len = strlen(text);

    char *tab = strstr(text, "\t");
    int numtabs = 0;

    while (tab != NULL) {
        numtabs++;
        tab = strstr(tab, "\t");
    }

    if (numtabs == 0) {
        return 0;
    }

    len += 3 * numtabs;
    char * result = out_area;

    int resulti = 0;
    for (int i = 0; i < len; i++) {
        if (text[i] == '\t') {
            for (int j = 0; j < 4; j++) {
                result[resulti++] = ' ';
            }
        } else {
            result[resulti++] = text[i];
        }
    }

    free(text);
    *rtext = result;

    return numtabs;

};

void print_speech(char *text, int width) {

    int len = strlen(text);

    if (len <= width) {
        print_single_line_bubble(text, len);
        return;
    }

    width -= 2; // for margins

    wrap_text(text, width);

    int line_count = 0;
    for (int i = 0; text[i] != '\0'; i++) {
        if (text[i] == '\n') {
            line_count++;
        }
    }

    print_bubble(text, width, line_count);

    printf("\n");   

}

struct Cow {
    char *eyes;
    char *tongue;
    char *thoughts;
    char *cow;
};

void print_cow(struct Cow *cow) {
    char default_cow[] = 
"        \\   ^__^\n" \
"         \\  (oo)\\_______\n" \
"            (__)\\       )\\/\\\n" \
"                ||----w |\n" \
"                ||     ||\n" ;
    char default_eyes[] = "oo";
    char default_thoughts[] = "\\";

    if (!cow->eyes) {
        cow->eyes = default_eyes;
    }
    if (!cow->thoughts) {
        cow->thoughts = default_thoughts;
    }
    if (!cow->cow) {
        cow->cow = default_cow;
    }
    // TODO: write a replace string function to support cowfile-like
    // substitution of features for $eyes, $tongue, and $thoughts into 
    // default_cow

    printf(default_cow);
}

int main(int argc, char** argv) {


    char *text = in_area; //  get_text(argc, argv);
    strcpy(text, text_in);


    if (!text) {
        return 1;
    }

    print_speech(text, 40);

    struct Cow cow = {};
    print_cow(&cow);

}
