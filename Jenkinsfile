#!groovy

node {

        echo "hello world"

       stage('Checkout'){
          checkout scm
       }

       stage('Test'){
         sh 'mvn --version'
       }

}