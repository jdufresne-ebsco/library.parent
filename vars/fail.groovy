def call() {

    library(
        identifier: "child@master",
        retriever: modernSCM(
            github(credentialsId: env.SECRET_ID, repoOwner: 'skinitimski', repository: 'library.child')
        )
    )

    stepFromChildOther()
    stepFromChildOther()

    stepFromChild()

    // this fails
    stepFromChild()
}
