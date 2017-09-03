#!groovy

node() {

          def mvnHome
          stage('Preparation') { // for display purposes
             // Get some code from a GitHub repository
             git 'https://github.com/zhang-hongjie/book-service.git'
             // Get the Maven tool. NOTE: This 'M3' Maven tool must be configured in the global configuration.
             mvnHome = tool 'M3'
          }



       stage('Test'){
         sh "'${mvnHome}/bin/mvn' --version"
       }


}