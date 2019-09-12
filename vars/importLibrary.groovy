def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(credentialsId: 'secret', repoOwner: 'skinitimski', repository: 'library.child')
        )
    )
}

