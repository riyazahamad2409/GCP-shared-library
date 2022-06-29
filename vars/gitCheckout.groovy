import hudson.plugins.git.GitSCM

def call(GitSCM) {
    checkout([
            $class: 'GitSCM',
            branches: [[name: env.master]],
            extensions: [[$class: 'CleanBeforeCheckout']],
            userRemoteConfigs: [[url: 'https://github.com/riyaz-ahamadm92/java-projects.git']],
    ])
}