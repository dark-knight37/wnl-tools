#!/bin/bash
rm -rf ../src/org/wnl/textual/node/*.java ../src/org/wnl/textual/lexer/*.java ../src/org/wnl/textual/parser/*.java ../src/org/wnl/textual/analysis/*.java
java -jar /home/stefano/local/sablecc-3.7/lib/sablecc.jar -d ../src/ wnl.sablecc

