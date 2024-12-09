#!/bin/bash

set -xe 

cat parser/java/basil_ir/VisitSkel.java \
  | sed -E 's/public //' \
  | sed -e 's/</[/g' \
  | sed -e 's/>/]/g' \
  | sed -e 's/implements/extends/' \
  | sed -e 's/A arg/arg: A/g' \
  | sed -E 's/(basil_ir\.Absyn\.[A-Za-z_]+) p/p : \1/' \
  | sed -E 's/R (visit\(.*\))/def \1 : R = /' \
  | sed -E 's/return null;/???/' \
  | sed -E 's/for \(([A-Za-z_0-8\.]+) x: ([\.a-zA-Z0-9_]+)\)/for (x : \1 <- \2.asScala)/' \
  | sed -E 's/package basil_ir;/package basil_ir;\nimport scala.jdk.CollectionConverters.*/' \
  > src/main/scala/translating/BasilIRLoader.scala


