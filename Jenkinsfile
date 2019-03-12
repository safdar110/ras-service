pipeline {
  environment {
    registry = "khawarhere/raservice"
    registryCredential = 'dockerhub'
    dockerImage = ''
   // PROJECT_NAME = 'rasdevak'
    ZONE = 'us-central1-a'
    CLUSTER_NAME = 'ras-cluster'
    IMAGE_NAME = 'raservice'
  }
  agent any
  stages {

    stage('Build Artifact') {
       steps {
         sh 'rm -rf target'
         sh 'mvn -DskipTests package'
       }
    }
    stage('Building Docker image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploy Docker Image') {
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
     stage('Deploy on Dev Server') {
          agent any
          when {
                branch 'master'
                beforeAgent true
               }
          steps{
            withCredentials([file(credentialsId: 'DEV_RAS_SA_KEY', variable: 'GC_KEY')]) {
                sh("gcloud auth activate-service-account --key-file=${GC_KEY}")
                sh("gcloud container clusters get-credentials $CLUSTER_NAME --zone $ZONE --project rasdevak")
                sh("cat .docs/deployment.yaml | sed -e 's/KVERSION/$BUILD_NUMBER/g' -e 's/KAPP_NAME/$IMAGE_NAME/g' | kubectl apply -f-")
              }
          }
        }
     stage('Deploy on Prod Server') {
          agent any
          when {
                branch 'prod'
                beforeAgent true
               }
          steps{
            withCredentials([file(credentialsId: 'PROD_RAS_SA_KEY', variable: 'GC_KEY')]) {
                sh("gcloud auth activate-service-account --key-file=${GC_KEY}")
                sh("gcloud container clusters get-credentials $CLUSTER_NAME --zone $ZONE --project rasprodak")
                sh("cat .docs/deployment.yaml | sed -e 's/KVERSION/$BUILD_NUMBER/g' -e 's/KAPP_NAME/$IMAGE_NAME/g' | kubectl apply -f-")
              }
          }
        }
  }
}