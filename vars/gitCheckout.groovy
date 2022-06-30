import com.mycompany.gcp.Git

def call(Map args=[:], Closure body={}) {
    node {
        stage("Checkout") {
            new Git(this).checkout("${args.repo}")
        }
    }
}
