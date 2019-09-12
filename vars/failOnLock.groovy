def call() {

    importLibrary()

    lock ('timski') {

        // fails
        stepFromChild()
    }
}

