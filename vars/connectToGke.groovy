def call() {
  
  echo "running kubectl test"
  sh "gcloud container clusters get-credentials cluster-1 --zone env.LOCATION --project env.PROJECT_ID"
  sh "kubectl get pods"
}
