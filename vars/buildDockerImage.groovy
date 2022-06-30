
def call() {
  node {
    
    stage('Build image') {
      class DbUtils{
        myapp = docker.build("riyazahamadm92/gcp-project:${env.BUILD_ID}")
        sh "print(myapp)"
        def save(myapp){...}
}
    }
  }
}
      
 
                    
