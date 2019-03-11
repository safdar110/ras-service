pipeline {
  environment {
    registry = "khawarhere/raservice"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/appiskeydev/raservice.git'
      }
    }
    stage('Build') {
       steps {
         sh 'rm -rf target'
         sh 'mvn -DskipTests package'
       }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Image') {
      steps{
         script {
            docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
     stage('Deployment') {
          steps{
            withCredentials([file(credentialsId: 'DEV_RAS_SA_KEY', variable: 'GC_KEY')]) {
                sh("export PROJECT_NAME=rasdevak")
                sh("export ZONE=us-central1-a")
                sh("export CLUSTER_NAME=ras-cluster")
                sh("export IMAGE_NAME=raservice")
                sh("gcloud auth activate-service-account --key-file=${GC_KEY}")
                sh("gcloud container clusters get-credentials $CLUSTER_NAME --zone $ZONE --project $PROJECT_NAME")
                sh("cat .docs/deployment.yaml | sed -e 's/KVERSION/$BUILD_NUMBER/g' -e 's/KAPP_NAME/$IMAGE_NAME/g' | kubectl apply -f-")
              }
          }
        }
  }
}