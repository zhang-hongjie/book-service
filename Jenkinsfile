#!groovy

node('node') {


    currentBuild.result = "SUCCESS"

    try {

       stage('Checkout'){
          checkout scm
       }

       stage('Test'){
         sh 'mvn --version'
       }

    }
    catch (err) {

        currentBuild.result = "FAILURE"

        throw err
    }

}