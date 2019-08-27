#!/bin/bash
mkdir -p target/classes
echo "" > target/classes/data.txt
for i in {1..10000}
do
   cat src/main/resources/loremipsum.txt >> target/classes/data.txt
done