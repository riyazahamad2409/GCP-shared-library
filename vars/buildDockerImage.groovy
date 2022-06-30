def call() {
  node {
    stage('Build image') {
      myapp = docker.build("riyazahamadm92/gcp-project:${env.BUILD_ID}")
    }
    stage('Push image') {
      docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
              myapp.push("latest")
              myapp.push("${env.BUILD_ID}")
      }
    }
  }
                    
