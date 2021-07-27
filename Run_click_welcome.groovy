pipeline {
    agent any

    stages {
        stage('click') {
            steps {
                bat 'python click().py'
            }
        }
        stage('checkout') {
            steps {
                bat 'welcome().py'
            }
        }
    }
}