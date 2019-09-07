String repo = 'omarvides/dockerized-api'

multibranchPipelineJob('dockerized-api') {
  branchSources {
    github {
      id('84aff50e-2652-4e95-a102-5eccc1c62e95')
      repository('dockerized-api')
      repoOwner('omarvides')
      checkoutCredentialsId('github-ssh')
      includes('*')
    }
  }
}