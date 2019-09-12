def call() {

    retry (3) {

        // fails
        stepFromChild()
    }
}

