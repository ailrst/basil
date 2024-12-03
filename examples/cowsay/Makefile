
.PHONY=all
all: cowsay.adt cowsay.relf

cowsay: cowsay.c
	aarch64-unknown-linux-musl-gcc -static cowsay.c -o cowsay

cowsay.adt: cowsay
	bap cowsay -d adt:cowsay.adt

cowsay.relf: cowsay
	aarch64-unknown-linux-musl-readelf -s -r -W cowsay > cowsay.relf

cowsay.gts: cowsay
	ddisasm cowsay --ir cowsay.gtirb
	gtirb-semantics cowsay.gtirb cowsay.gts
