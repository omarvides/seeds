String repo = 'omarvides/dockerized-api'

multibranchPipelineJob('example') {
  branchSources {
    github {
      id('84aff50e-2652-4e95-a102-5eccc1c62e95')
      repository('dockerized-api')
      repoOwner('omarvides')
      checkoutCredentialsId('github-user')
      includes('*')
    }
  }
}