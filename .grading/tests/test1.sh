#!/usr/bin/env bash

if ! printf "19230\n" | GRADLE_OPTS="-Dfile.encoding=utf-8" ./gradlew --quiet --console plain run | tr '[:upper:]' '[:lower:]' | grep -q "onkiniemi"; then
	echo "With postal code 19230, the output should contain \"onkiniemi\""
	exit 1
fi
