def call() {
  node {
    stage('Deploy to GKE') {
      sh "sed -i 's/tagversion/${env.BUILD_ID}/g' deployment.yaml"
      step([$class: 'KubernetesEngineBuilder', projectId: env.PROJECT_ID, clusterName: env.CLUSTER_NAME, location: env.LOCATION, manifestPattern: 'deployment.yaml', credentialsId: env.CREDENTIALS_ID, verifyDeployments: true])
    }
  }
}
