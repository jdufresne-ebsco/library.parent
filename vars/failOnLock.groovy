def call() {

    importLibrary()

    lock ('timski') {

        stepFromChild()
    }
}

