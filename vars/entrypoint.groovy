def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(
                credentialsId: 'github-shared-secret',
                repoOwner: 'skinitimski',
                repository: 'library.child'
            )
        )
    )

    stepFromChild()

    stage ('timski') {

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

