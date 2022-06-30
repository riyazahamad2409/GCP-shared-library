def call() {
    node {
    
        stage("Compile") {
           withMaven(
               maven: 'maven-3'
           ){
            sh "mvn clean compile"
           }
        }

        
    }
}
