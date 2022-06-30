import hudson.plugins.git.GitSCM

def call(Map args=[:]) {
    node {
        stage("Checkout") {
            new Git(this).checkout("${args.repo}")
        }
    }
}
