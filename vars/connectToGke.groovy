def call(Map file = [:]) {
  
  echo "running kubectl test"
 
  sh "gcloud container clusters get-credentials cluster-1 --zone "env.LOCATION" --project "env.PROJECT_ID""
  sh "kubectl apply -f ${file.name}.yaml"
  sh "kubectl get pods"
}
