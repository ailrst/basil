

.PHONY=all
all: to_base64.out to_base64.adt to_base64.relf

to_base64.out : to_base64.c
	aarch64-unknown-linux-gnu-gcc to_base64.c -o to_base64.out -O3

to_base64.adt : to_base64.out
	bap to_base64.out -d adt:to_base64.adt

to_base64.relf : to_base64.out
	readelf -s -r -W to_base64.out > to_base64.relf


