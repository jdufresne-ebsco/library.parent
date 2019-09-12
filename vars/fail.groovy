def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(credentialsId: env.SECRET_ID, repoOwner: 'skinitimski', repository: 'library.child')
        )
    )

    stepFromChildOther()
    stepFromChildOther()

    // this fails when it tries to call stepFromChildOther a second time
    stepFromChild()
}
