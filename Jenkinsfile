pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the repository
                checkout scm
            }
        }
        
        stage('Terraform Deployment') {
            steps {
                script {
                    // Change to the Terraform directory
                    dir('/path/to/your/terraform/directory') {
                        // Initialize Terraform
                        sh 'terraform init'
                        
                        // Apply the changes to create the EC2 instance
                        sh 'terraform apply -auto-approve'
                    }
                }
            }
        }
    }
    
    post {
        always {
            // Clean up resources using 'terraform destroy'
            script {
                dir('/path/to/your/terraform/directory') {
                    sh 'terraform destroy -auto-approve'
                }
            }
        }
    }
}
