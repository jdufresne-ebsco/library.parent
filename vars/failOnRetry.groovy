def call() {

    importLibrary()

    retry (3) {

        // fails
        stepFromChild()
    }
}

