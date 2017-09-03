# Install on macosx

https://jenkins.io/download/thank-you-downloading-osx-installer-stable/

https://wiki.jenkins.io/display/JENKINS/Thanks+for+using+OSX+Installer

# Install on Docker

https://hub.docker.com/r/jenkins/jenkins/

    docker pull jenkins/jenkins
    
### How do you get docker working in the pipeline with this image? 
   
It seems that docker needs to be installed on the host server in order to work by running a docker command remotely? https://issues.jenkins-ci.org/browse/JENKINS-44093 