package `Exemple Classes`


fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 80
    myAquarium.printSize()

}


fun main() {
    buildAquarium()
}