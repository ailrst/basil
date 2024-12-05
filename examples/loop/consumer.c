
#include <stdbool.h>
#include <stdlib.h>

volatile int product;
int res;

void consumer(int secret) {
  int r = 0;
  while (product > 0) {
    product--;
    r = product;
  }
  if (r == 0) {
    res = r;
  } else {
    res = r + secret;
  }
}

int main() {

}
