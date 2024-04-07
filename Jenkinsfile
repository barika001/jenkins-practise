pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout your repository where Calculator.java resides
                git 'https://github.com/barika001/jenkins-practise.git'
            }
        }
        
        stage('Build') {
            steps {
                // Compile Calculator.java
                sh 'javac Calculator.java'
            }
        }
        
        stage('Test') {
            steps {
                // Run simple JUnit test directly in the pipeline script
                junit 'CalculatorTest'
            }
        }
    }
}

