String path = 'ci-jobs'
String repo = 'omarvides/dockerized-api'

folder(path) {
  description 'This folder contains all the ci-jobs'
}

job("$path/dockerized-app") {
  scm {
    github repo
  }
}