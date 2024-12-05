Globals: 
res: int
product: int

L: product -> true, res -> true
Rely: product >= old(product)
Guarantee: true

Subroutine: main 
Requires: product >= 0bv32
