pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Add your build commands here
                sh 'mvn clean install'  // Example for Maven projects
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing...'
                // Add your testing commands here
                sh 'mvn test'  // Example for Maven projects
            }
        }
        
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                // Add your deployment steps here
                sh 'echo Deploy to production'  // Dummy step
            }
        }
    }
}
