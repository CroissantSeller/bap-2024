pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'JDK_21'
    }
    environment {
        MAVEN_OPTS = '-Dmaven.repo.local=.m2/repository'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/CroissantSeller/bap-2024.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        success {
            echo 'Build completed successfully!'
        }
        failure {
            echo 'Build failed!'
        }
    }
}
