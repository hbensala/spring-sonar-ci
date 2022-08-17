pipeline {
    agent any
    stages {
        stage('Gradle Install') {
          agent {
            docker {
              image 'gradle:7.4-jdk11'
              args  '--net="net-actia-demo"'
            }
          }
          steps {
                withSonarQubeEnv('sonarqube') {
                    echo ">> currentBuild started: ${currentBuild}"
                    sh "gradle wrapper --no-daemon"
                    sh "./gradlew sonarqube --no-daemon"
                    echo ">> currentBuild done"
                }
          }

        }

        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
    }
}

