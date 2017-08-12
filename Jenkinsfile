pipeline {
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