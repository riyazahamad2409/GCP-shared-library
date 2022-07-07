def call() {
    
    node {
    
        stage("Compile") {
            sh "npm install"
        }
        stage("Unit Test") {
            sh "npm run test"
        }

        stage("Integration Test") {
            sh "npm run build"
        }
        
    }
}
