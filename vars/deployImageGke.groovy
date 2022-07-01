def call() {
  node {
    stage('Deploy to GKE') {
      sh "sed -i 's/tagversion/${env.BUILD_ID}/g' env.DEPLOYMENT_YAML.yaml"
      step([$class: 'KubernetesEngineBuilder', projectId: env.PROJECT_ID, clusterName: env.CLUSTER_NAME, location: env.LOCATION, manifestPattern: env.DEPLOYMENT_YAML.yaml, credentialsId: env.CREDENTIALS_ID, verifyDeployments: true])
    }
  }
}
