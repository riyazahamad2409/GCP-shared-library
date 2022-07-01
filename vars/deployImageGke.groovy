def call(Map file = [:]) {
  node {
    stage('Deploy to GKE') {
      sh "sed -i 's/tagversion/${env.BUILD_ID}/g' ${file.name}.yaml"
      step([$class: 'KubernetesEngineBuilder', projectId: env.PROJECT_ID, clusterName: env.CLUSTER_NAME, location: env.LOCATION, manifestPattern: '${file.name}.yaml', credentialsId: env.CREDENTIALS_ID, verifyDeployments: true])
    }
  }
}
