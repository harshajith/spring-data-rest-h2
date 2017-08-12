pipeline {
    agent none
    stages {
        stage('build') {
            steps {
                sh 'gradle -version'
                sh 'gradlew build'
            }
        }
    }
}