package `Kotlin-Basics`.`Exercice-1 Pyramide d'étoile`
fun main(){

print("enter number : ")
var p = readln()!!.toInt()

    for (n in 1..p){


        for (a in 1..n){
            print(" *")
        }
        println()
    }



}
