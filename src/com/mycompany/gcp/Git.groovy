package com.mycompany.gcp

class Git implements Serializable {

    private final def script

    Git(def script) {
        this.script = script
    }

    def checkout(String repo) {
        this.script.git credentialsId: Constants.JENKINS_GITHUB_CREDENTIALS_ID, url: "https://github.com/colinbut/${repo}.git"
    }

}
