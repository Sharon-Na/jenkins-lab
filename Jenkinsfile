pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
    }
    post {
        success {
            emailext (
                subject: "빌드 성공: ${env.JOB_NAME}",
                body: "빌드가 성공했습니다!\n빌드 번호: ${env.BUILD_NUMBER}",
                to: "syalon020@gmail.com"
            )
        }
        failure { 
            emailext (
                subject: "빌드 실패: ${env.JOB_NAME}",
                body: "빌드가 실패했습니다!\n빌드 번호: ${env.BUILD_NUMBER}",
                to: "syalon020@gmail.com"
            )
        }
    }
}