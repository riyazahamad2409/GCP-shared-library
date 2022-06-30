import hudson.plugins.git.GitSCM

def call(GitSCM, Map args = [:], Closure body={}) {
    checkout([
            $class: 'GitSCM',
            branches: [[name: '*/master']],
            extensions: [[$class: 'CleanBeforeCheckout']],
            userRemoteConfigs: [[credentialsId: 'github_credentials', url: 'https://github.com/riyaz-ahamadm92/${args.repo}.git']],
    ])
    body()
}
