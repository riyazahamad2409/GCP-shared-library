import com.mycompany.gcp.Git

def call(Map args=[:]) {
    node {
        stage("Checkout") {
            new Git(this).checkout("${args.repo}")
        }
    }
}
