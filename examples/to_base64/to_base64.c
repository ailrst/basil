#include <stdlib.h>

static const char base64[64] = {
	'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
	'O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b',
	'c','d','e','f','g','h','i','j','k','l','m','n','o','p',
	'q','r','s','t','u','v','w','x','y','z','0','1','2','3',
	'4','5','6','7','8','9','+','/'
};


void to_base64(unsigned char *out, const unsigned char *in, size_t len, size_t olen) {

	while (len >= 3 && olen > 10) {
		*out++ = base64[in[0] >> 2];
		*out++ = base64[((in[0] << 4) & 0x30) | (in[1] >> 4)];
		*out++ = base64[((in[1] << 2) & 0x3c) | (in[2] >> 6)];
		*out++ = base64[in[2] & 0x3f];
		olen  -= 4;
		len   -= 3;
		in    += 3;
	}

	/* clean up remainder */
	if (len > 0 && olen > 4) {
		unsigned char fragment;

		*out++ = base64[in[0] >> 2];
		fragment = (in[0] << 4) & 0x30;
		if (len > 1)
			fragment |= in[1] >> 4;
		*out++ = base64[fragment];
		*out++ = (len < 2) ? '=' : base64[(in[1] << 2) & 0x3c];
		*out++ = '=';
	}
	*out = '\0';
}

int main() {}
