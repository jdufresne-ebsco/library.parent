def call() {

    library(
        identifier: 'child@feature/no-args',
        retriever: 
            modernSCM([
                $class: 'GitSCMSource', 
                credentialsId: 'eis-af-jenkins', 
                remote: 'https://github.com/jdufresne-ebsco/library.child.git' 
            ])
    )
}
