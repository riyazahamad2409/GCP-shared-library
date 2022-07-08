def call() {
    
    node {
    

        stage("Unit Test") {
            sh "npm install"
        }
        stage("Unit Test") {
            sh "ng build --prod"
        }

        
        
    }
}
