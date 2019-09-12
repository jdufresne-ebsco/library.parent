def call() {

    lock ('timski') {

        // fails
        stepFromChild()
    }
}

