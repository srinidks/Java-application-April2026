pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK21'
    }

    stages {

        stage('Check out code source code from GITHUB') {
            steps {
                git 'https://github.com/<your-username>/Java-app-April2026.git'
            }
        }

        stage('Build the artifact') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test Run') {
            steps {
                sh 'java -jar target/java-app.jar'
            }
        }

        stage(' Build Docker image from Dockerfile') {
            steps {
                sh 'docker build -t java-app .'
            }
        }

        stage('Deploy  The docker Container') {
            steps {
                sh 'docker rm -f java-app'
                sh 'docker run -d -p 8081:8080 java-app || true'
            }
        }
    }
}
