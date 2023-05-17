package Exercice3

interface IManagmentProduct {



    abstract fun Add()
    abstract  fun Delete()
    abstract fun Display()

}
class ManagmentProduct:IManagmentProduct{
    val  product = mutableListOf<String>()
    override fun Display() {
        println("Product: ")
        for (Name in product){
            println(Name)


        }
    }

    override fun Add() {
        print("Add Product : ")
        var Name = readLine()!!.toString()
        product.add(Name)


    }

    override fun Delete() {
        println("Remove Product : ")
        var delete = readLine()!!.toString()
        product.remove(delete)
    }
}


