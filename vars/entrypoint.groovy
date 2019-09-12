def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(credentialsId: 'github-shared-secret', repoOwner: 'skinitimski', repository: 'library.child')
        )
    )

    // works fine
    stepFromChild()

    stage ('timski') {

        // this breaks
        stepFromChild()
    }

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

