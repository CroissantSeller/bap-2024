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
        stage('Deploy') {
            steps {
                // Deployment logic (e.g., Docker, Kubernetes, SCP, etc.)
                // Example: sh 'scp target/your-app.jar user@server:/path/to/deploy'
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
