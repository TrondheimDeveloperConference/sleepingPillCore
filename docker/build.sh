#!/bin/bash

cd ..
mvn clean install -Dmaven.test.skip
cp target/sleepingPillCore-1.0.TDC-jar-with-dependencies.jar docker/sleepingPillCore.jar
docker build -t trondheimdc/sleepingpillcore docker
rm docker/sleepingPillCore.jar
docker push trondheimdc/sleepingpillcore