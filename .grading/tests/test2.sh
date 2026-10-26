#!/usr/bin/env bash

if ! printf "tammisaari\n" | GRADLE_OPTS="-Dfile.encoding=utf-8" ./gradlew --quiet --console plain run | tr '[:upper:]' '[:lower:]' | grep -Eq ".*10600[^\\d]+10601[^\\d]+10620[^\\d]+10650[^\\d]+10660.*"; then
	echo "With place name \"tammisaari\", the output should contain postal codes 10600...10660 in alphabetical order"
	exit 1
fi