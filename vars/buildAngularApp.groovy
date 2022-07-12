def call() {
    
    node {
    

        stage("Install node modules") {
            sh "sudo npm install -g npm@8.10.0"
        }
    }
}
