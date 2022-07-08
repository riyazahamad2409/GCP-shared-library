def call() {
    
    node {
    

        stage("Install node modules") {
            sh "npm install"
        }
        stage("Build App") {
            sh "npm start"
        }

        
        
    }
}
