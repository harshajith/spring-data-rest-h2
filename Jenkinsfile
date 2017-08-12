pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'gradlew -version'
                sh 'gradlew build'
            }
        }
        stage('stage 2'){
            steps {
                echo 'Hello pipeline'
            }
        }
    }
}