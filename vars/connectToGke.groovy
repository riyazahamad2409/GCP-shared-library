def call() {
  
  echo "running kubectl test"
  sh "gcloud container clusters get-credentials cluster-1 --zone us-central1-c --project mineral-hangar-354512"
  sh "kubectl get nodes"
}
