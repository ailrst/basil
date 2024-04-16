
#include <stdlib.h>
#include <stdbool.h>
#include <stdio.h>
#include <string.h>

#define SZ 11

char buf[SZ];
char stext[SZ] = "user:pass";
int c = 1; 
char *uname;
char *passwd;


void mfree(void *x) {
  printf("%x\n", x);
}

void mmemcpy(char *out, char *in, int len)  {
  for (int i = 0; i < len; i++) {
    out[i] = in[i];
  }
}


void mmemset(char *out, int in, int len)  {
  for (int i = 0; i < len; i++) {
    out[i] = in;
  }
}


int main(int argc, char **argv) {
  c = 0;
  mmemcpy(buf, stext, 11);

  char * pos = buf + 4;
  // *pos = '\0';
  uname = buf;
  passwd = buf + 1;

  mmemset(buf, 0, 11);

  // wait for x to be read

  c = 1;
  mfree(buf);


}
