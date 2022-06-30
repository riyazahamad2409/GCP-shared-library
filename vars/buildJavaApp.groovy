import com.mycompany.gcp.Git

def call(Map args=[:], Closure body={}) {
    node {
        stage("Checkout") {
            new Git(this).checkout("${args.repo}")
        }

        stage("Compile") {
            sh "./mvn clean compile"
        }

        stage("Unit Test") {
            sh "./mvn test"
        }

        stage("Integration Test") {
            sh "./mvn verify"
        }

        stage("Package Artifact Jar") {
            sh "./mvn package -DskipTests=true"
        }
        body()
    }
}
