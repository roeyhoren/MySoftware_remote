pipeline {
    agent any

    stages {
        stage('click') {
            steps {
                bat 'python click().py'
            }
        }
        stage('welcome') {
            steps {
                bat 'python welcome().py'
            }
        }
    }
}
