
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

/**
 * buf is secret
 */
void parse(char * buf) {

  char * pos = buf + 4;
  *pos = 0;
  uname = buf;
  passwd = buf + 1;

  memset(buf, 0, strlen(buf));

  // wait for x to be read

  c = 1;
  mfree(buf);
}

int main(int argc, char **argv) {
  c = 0;
  memcpy(buf, stext, 11);
  parse(buf);

}
