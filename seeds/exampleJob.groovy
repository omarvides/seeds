multibranchPipelineJob('example') {
  branchSources {
    git {
      id('84aff50e-2652-4e95-a102-5eccc1c62e95')
      remote('git@github.com:omarvides/dockerized-api.git')
      credentialsId('github-user')
      includes('*')
    }
  }
}