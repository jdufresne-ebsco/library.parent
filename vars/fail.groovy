def call() {

    importLibrary()

    stepFromChildOther([:])
    stepFromChildOther([:])

    // this fails when it tries to call stepFromChildOther a second time
    stepFromChild([:])
}
