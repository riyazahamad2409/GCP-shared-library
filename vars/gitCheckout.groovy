import hudson.plugins.git.GitSCM

def call(GitSCM) {
    checkout([
            $class: 'GitSCM',
            branches: [[name: '*/master']],
            extensions: [[$class: 'CleanBeforeCheckout']],
            credentialsId: [['github_credentials']],
            userRemoteConfigs: [[url: 'https://github.com/riyaz-ahamadm92/java-projects.git']],
    ])
}
