#!/usr/bin/env bash

export SERVICE_NAME=raservice

eval $(minikube docker-env)

#./mvnw package
./mvnw -DskipTests package
git add .
git commit -m "updated via script"
git push origin master
export VERSION=$(git rev-parse --short HEAD)

docker build -t $SERVICE_NAME:$VERSION .

#cat .docs/configmap.yaml | kubectl apply -f-

#kubectl apply -f .docs/configmap.yaml

cat .docs/deployment.yaml | sed -e "s/@KVERSION/$VERSION/g" -e "s/@KSERVICE/$SERVICE_NAME/g" | kubectl apply -f-

#cat .docs/deployment-backup.yaml | sed -e "s/@KVERSION/$VERSION/g" -e "s/@KSERVICE/$SERVICE_NAME/g" | kubectl delete -f-
