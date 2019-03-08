node{
    stage('SCM Checkout'){
        git 'https://github.com/appiskeydev/raservice'
    }
    stage('Compile-Package'){
        sh 'mvn package'
    }
}