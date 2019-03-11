pipeline {
  environment {
    registry = "khawarhere/raservice"
    registryCredential = 'dockerhub'
    dockerImage = ''
    PROJECT_NAME = 'rasdevak'
    ZONE = 'us-central1-a'
    CLUSTER_NAME = 'ras-cluster'
    IMAGE_NAME = 'raservice'
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

                sh("gcloud auth activate-service-account --key-file=${GC_KEY}")
                sh("gcloud container clusters get-credentials $CLUSTER_NAME --zone $ZONE --project $PROJECT_NAME")
                sh("cat .docs/deployment.yaml | sed -e 's/KVERSION/$BUILD_NUMBER/g' -e 's/KAPP_NAME/$IMAGE_NAME/g' | kubectl apply -f-")
              }
          }
        }
  }
}