def call() {
  node {
    stage('Build image') {
      myapp = docker.build("riyazahamadm92/gcp-project:${env.BUILD_ID}")
    }
    }
  }
                    
