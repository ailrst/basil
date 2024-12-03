#!/bin/bash
set -xe
./mill run -i examples/cowsay/cowsay.adt -r examples/cowsay/cowsay.relf --interpret

