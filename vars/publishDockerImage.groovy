import vars



def call() {
  node {
    
    stage('Push image') {
      docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
              Exam.myapp.push("latest")
              Exam.myapp.push("${env.BUILD_ID}")
      }
    }
  }
}
      
 
                    
