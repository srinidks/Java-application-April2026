pipeline {
    agent any

    tools {
        jdk 'JDK21'
    }

    stages {



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
                sh 'docker build -t srinidks/java-app-2026 .'
            }
        }

        stage('Deploy  The docker Container') {
            steps {
                sh 'docker rm -f java-app'
                sh 'docker run -d -p 8081:8081 srinidks/java-app:latest || true'
            }
        }
    }
}
