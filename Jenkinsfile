pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Spring application using Maven or Gradle
                sh 'mvn clean install'  // or 'gradle build'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'  // or 'gradle test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application (e.g., to a Tomcat server)
                sh 'mvn jar:jar deploy:deploy'  // or any deployment command you use
            }
        }
    }
}
// pipeline {
// 	agent any
//
// 	stages {
//         stage('Checkout') {
//             steps {
//                 // Checkout the source code from the repository
//                 checkout scm
//             }
// 		stage('Build'){
// 			steps {
// 				bat "mvn clean install -DskipTests"
// 			}
// 		}
//
// 		stage('Test'){
// 			steps{
// 				bat "mvn test"
// 			}
// 		}
//
// 		stage('Deploy') {
// 			steps {
// 			    bat "mvn jar:jar deploy:deploy"
// 			}
// 		}
// 	}
// }