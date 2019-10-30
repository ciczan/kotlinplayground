package com.ciczan.learnkotlin.classes

class Person {
    //Val are get-set properties
    var name = "No Name" //Type is inferred
        set(value) { //Overriding the set.
            //Weird way of doing it.
            field = value.toUpperCase()
        }

}

fun main(args: Array<String>) {

    val cicero = Person()
    cicero.name = "Cicero"
    println("Name: ${cicero.name}")

}
