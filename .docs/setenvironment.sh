#!/usr/bin/env bash

PROJECT_NAME=rasdevak

export ZONE=us-central1-a
export CLUSTER_NAME=ras-cluster
export NAMESPACE=nsras
export SERVICE_ACCOUNT=devops@$PROJECT_NAME.iam.gserviceaccount.com

export KEY_FILE=$RAS_KEY_FILE_LOCATION
gcloud auth activate-service-account $SERVICE_ACCOUNT --key-file=$KEY_FILE --project=$PROJECT_NAME


gcloud config set project $PROJECT_NAME
gcloud config set compute/zone $ZONE
gcloud container clusters get-credentials $CLUSTER_NAME
kubens $NAMESPACE

# Docker Login

docker login -u="$DOCKER_USERNAME" -p="$DOCKER_PASSWORD"

echo "==============================================="

echo "PROJECT_NAME" : $PROJECT_NAME
echo "CLUSTER_NAME" : $CLUSTER_NAME
echo "NAMESPACE"    : $NAMESPACE
echo "ZONE"         : $ZONE

#========================================================
