def call(Map file = [:]) {
  
  echo "running kubectl test"
  sh "pwd"
  sh "sed -i 's/tagversion/${env.BUILD_ID}/g' ${file.name}.yaml"
  sh "gcloud container clusters get-credentials cluster-1 --zone ${file.zone} --project ${file.project}"
  
  sh "kubectl apply -f ${file.name}.yaml"
  sh "kubectl get pods"
  sh "sleep 30s"
  sh "kubectl get pods"
}
