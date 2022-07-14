def call() {
    
    node {
    

        stage("Install node modules") {
            sh "npm install"
            sh "pwd"
        }
    }
}
