// Import the Job DSL library
import javaposse.jobdsl.dsl.Job

// Define a pipeline job
Job pipelineJob = pipelineJob('Terraform_Deployment_Pipeline') {
    // Define the pipeline script
    definition {
        cps {
            script(readFileFromWorkspace('Jenkinsfile'))  // Read the Jenkinsfile from the workspace
        }
    }
}
