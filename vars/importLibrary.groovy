def call() {

    library(
        identifier: 'child@master',
        retriever: 
            modernSCM([
                $class: 'GitSCMSource', 
                credentialsId: 'eis-af-jenkins', 
                remote: 'https://github.com/skinitimski/library.child.git' 
            ])
    )
}

