multibranchPipelineJob('example') {
  branchSources {
    git {
      remote('git@github.com:omarvides/dockerized-api.git')
      credentialsId('github-user')
      includes('*')
    }
  }
}
