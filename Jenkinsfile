pipeline {
    agent any

    stages {
        stage('build') {
            steps {
            // Sklonuj repozytorium GIT
            git 'https://github.com/tozdeb/greetings-demo-app-fork.git'
            
            // Zbuduj przy pomocy Mavena
            sh './mvnw package'
            
            // Opublikuj raport JUnit
            junit 'target/surefire-reports/*.xml'
            
            // Opublikuj raport Jacoco
            }
        }
        stage('test') {
            steps {
                echo 'testuje'
            }
        }
        stage('scan') {
            steps {
                echo 'skanuję'
            }
        }
        stage('deploy') {
            steps {
                echo 'wdrazam'
            }
        }
    }
    post {
        success {
            echo 'Wdrozono'
        }
    }
}