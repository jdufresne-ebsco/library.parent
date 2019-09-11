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

    lock ('timski') {

        stepFromChild()
    }
}

