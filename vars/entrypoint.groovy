def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(credentialsId: 'github-shared-secret', repoOwner: 'skinitimski', repository: 'library.child')
        )
    )

    stepFromChild()
    stepFromChild()

    stage ('timski') {

        stepFromChild()

        stepFromChild()
    }

    stepFromChild()

    node {

        stepFromChild()
    }

    retry (3) {

        stepFromChild()
    }

    lock ('timski') {

        stepFromChild()
    }
}

