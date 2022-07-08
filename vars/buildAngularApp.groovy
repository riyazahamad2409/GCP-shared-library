def call() {
    
    node {
    

        stage("Unit Test") {
            sh "npm run test"
        }

        stage("Integration Test") {
            sh "npm run build"
        }
        
    }
}
