def call() {

    importLibrary()

    node {

        // fails
        stepFromChild()
    }
}

