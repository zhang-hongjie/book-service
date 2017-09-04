#!groovy

// https://jenkins.io/doc/pipeline/tour/hello-world/#examples
// https://jenkins.io/doc/book/pipeline/docker/


node() {

    try {

        stage('Checkout'){
            // Get some code from a GitHub repository
            //git 'https://github.com/zhang-hongjie/book-service.git'
            checkout scm
        }

        stage('Build') {
            sh 'echo $PATH'
            docker.image('maven:3.3.9').inside('-v $HOME/.m2:/root/.m2') {
                sh 'mvn --version'
                sh 'mvn -Dmaven.test.failure.ignore clean package'
            }
        }

        stage('Results') {
            junit '**/target/surefire-reports/TEST-*.xml'
            archive 'target/*.jar'
        }

    } catch (err) {

        throw err

    } finally {


        def currentResult = currentBuild.result ?: 'SUCCESS'
        echo "The result is ${currentResult}"

        if (currentResult == 'UNSTABLE') {
          echo 'This will run only if the run was marked as unstable'
        }

        def previousResult = currentBuild.previousBuild?.result
        if (previousResult != null && previousResult != currentResult) {
          echo 'This will run only if the state of the Pipeline has changed'
          echo 'For example, if the Pipeline was previously failing but is now successful'
        }

        echo 'Finished'
    }

}



