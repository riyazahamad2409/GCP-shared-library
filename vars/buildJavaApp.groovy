def call(Maven build) {
    node {
    
        stage("Compile") {
            sh "mvn clean compile"
        }

        stage("Unit Test") {
            sh "mvn test"
        }

        stage("Integration Test") {
            sh "mvn verify"
        }

        stage("Package Artifact Jar") {
            sh "mvn package -DskipTests=true"
        }
    }
}
