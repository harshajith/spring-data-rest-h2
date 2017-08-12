pipeline {
    agent { docker 'maven:3.3.3' }
    stages {
        stage('build') {
            steps {
                sh 'gradle -version'
                sh 'gradlew build'
            }
        }
        stage('stage 2'){
            echo 'Hello pipeline'
        }
    }
}