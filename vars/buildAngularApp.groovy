def call() {
    
    node {
    

        stage("Install node modules") {
            sh "npm install -g npm@8.10.0"
        }
        stage("Build App") {
            sh "npm run build"
        }

        
        
    }
}
