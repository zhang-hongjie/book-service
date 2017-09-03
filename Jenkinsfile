#!groovy

node('node') {

    echo "hello world"

    stage('Checkout'){
        checkout scm
    }

    stage('Test'){
        mvn --version
    }

}