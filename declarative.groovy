
      pipeline {
        agent any 
        stages {
          stage('pull') { 
            steps {
              git branch: 'main', credentialsId: 'gitlab', url: 'https://gitlab.com/shubham-likhar/devops-jenkins.git'
            }
          }
          stage('test') { 
            steps {
              sh '''ls
                 pwd''' 
            }
          }
          stage('Deploy') { 
            steps {
              echo 'code deploy '
            }
          }
        }
      }