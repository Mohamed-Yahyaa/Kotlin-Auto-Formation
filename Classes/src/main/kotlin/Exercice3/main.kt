package Exercice3

fun main(args: Array<String>) {

    var i=0
    var product  = ManagmentProduct()
    while (i<4){
        println("Product management list")
        println("1.Add")
        println("2.Display")
        println("3.Delete")
        println("4.Exit")
        println("-----------")
        print("Choose a number : ")
        var value = readLine()!!.toInt()
        when(value){
            1 -> product.Add()
            2 -> product.Display()
            3 -> product.Delete()
            4 -> break
        }
    }
}