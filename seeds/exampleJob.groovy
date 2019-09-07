String repo = 'omarvides/dockerized-api'

multibranchPipelineJob('example') {
  branchSources {
    scm {
      github repo
    }
  }
}