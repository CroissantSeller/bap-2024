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
                bat 'mvn clean package'
            }
        }
        stage('Docker Build') {
            steps {
                script {
                    docker.build env.DOCKER_IMAGE
                }
            }
        }
        
        stage('Docker Push') {
            steps {
                script {
                    docker.image(env.DOCKER_IMAGE).push()
                }
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
