pipeline {
    agent any
    tools {
        maven 'Maven 3.9.5'
        jdk 'JDK 21.0.2'
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
