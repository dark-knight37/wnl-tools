#!/bin/bash

rm -rf ../src/bn/analysis/distribution/node/*.java ../src/bn/analysis/distribution/lexer/*.java ../src/bn/analysis/distribution/parser/*.java ../src/bn/analysis/distribution/analysis/*.java
java -jar ../lib/sablecc.jar -d ../src/ bndistribution.sablecc

rm -rf ../src/wnl/textual/node/*.java ../src/wnl/textual/lexer/*.java ../src/wnl/textual/parser/*.java ../src/wnl/textual/analysis/*.java
java -jar ../lib/sablecc.jar -d ../src/ wnl.sablecc

read -p "Press enter to continue"
