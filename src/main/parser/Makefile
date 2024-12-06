all: tex/BasilIR.pdf java/basil_ir/BasilIRParser.g4 runcpp ocaml/AbsBasilIR.ml runjava

java/basil_ir/Test.class: java/basil_ir/BasilIRParser.g4
	$(MAKE) -C java


.PHONY=runjava
runjava: java/basil_ir/Test.class FORCE
	CLASSPATH="$$CLASSPATH:java"  java basil_ir.Test ../../../test-output.il

java/basil_ir/BasilIRParser.g4: BasilIR.cf
	bnfc --java-antlr -m -o java BasilIR.cf

cpp/TestBasilIR: BasilIR.cf
	bnfc --cpp -m -o cpp BasilIR.cf
	$(MAKE) -C cpp

runcpp: cpp/TestBasilIR FORCE
	./cpp/TestBasilIR ../../../test-output.il

ocaml/AbsBasilIR.ml: BasilIR.cf
	bnfc --ocaml-menhir -m -o ocaml BasilIR.cf


tex/BasilIR.pdf: BasilIR.cf
		bnfc --latex -m -o tex BasilIR.cf
		$(MAKE) -C tex

FORCE: ;
