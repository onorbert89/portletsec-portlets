#!/bin/bash
for i in `find . -name "*.jar"`; do cp $i jars/`basename $i`;done