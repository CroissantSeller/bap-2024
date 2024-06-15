pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JAVA_21'
    }
    environment {
        MAVEN_OPTS = '-Dmaven.repo.local=.m2/repository'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/CroissantSeller/bap-2024.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
