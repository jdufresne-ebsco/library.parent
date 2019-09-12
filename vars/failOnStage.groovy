def call() {

    importLibrary()

    stage ('timski') {

        // fails
        stepFromChild()
    }
}

