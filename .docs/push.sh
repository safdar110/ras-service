#!/usr/bin/env bash

export APP_NAME=raservice
#rm -rf target
#git pull origin master
#./mvnw -DskipTests package
export VERSION=$(git rev-parse --short HEAD)
docker build -t khawarhere/$APP_NAME:$VERSION .
source setenvironment.sh
docker image push khawarhere/$APP_NAME:$VERSION
cat .docs/deployment.yaml | sed -e "s/@KVERSION/$VERSION/g" -e "s/@KAPP_NAME/$APP_NAME/g" | kubectl apply -f-