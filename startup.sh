#!/bin/sh
git clone "$1" /home/test
cd /home/test
mvn test -Dtest="$2"
