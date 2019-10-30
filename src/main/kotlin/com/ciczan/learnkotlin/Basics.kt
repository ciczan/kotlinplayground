package com.ciczan.learnkotlin

import java.util.*

//Value object
class Person(var name: String)

//Properties
class Rectangle(var largura: Int, var altura: Int) {
    //Overriding properties acessors
    var isSquare: Boolean
        get() = largura == altura
        set(value) {
            if (value)
                largura = altura
        }

}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr) : Int =
        when(e) {
            is Num -> {
                println(e.value)
                e.value
            }
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Truco")
        }


fun main(args: Array<String>) {

    val ret1 = Rectangle(30, 30)
    println("Rectangle 1: ${ret1.isSquare}")

    ret1.altura = 2
    println("Rel 1: ${ret1.isSquare}")

    ret1.isSquare = true
    println("Rel 1: ${ret1.isSquare}")

    val menor = if (1 > 2) 3 else 5
    println("Truco $menor")

    fun maior() = if (1 > menor) 3 else 5

    println(maior())

    val bd = 5.4e23

    val languages = arrayListOf("Java", "Scala")
    println(languages)

    val person = Person("cicero")
    println(person.name)
    person.name = "Augusto"
    println(person.name)

    println (eval(Sum(Sum(Num(1), Num(2)), Num(4))))

    //Ranges
    val mil = 1000 to 12
    val oneToTen = 100 downTo 1 step 2

    rangesAndProgressions()

    iteratingOverMaps()

    usingInInColletions()
}

fun rangesAndProgressions() {
    println("Ranges and Progressions")

    //Inclusive
    val oneToTen = 1 .. 10
    for (ii in oneToTen) {
        println("OneToTen $ii")
    }

    //Non Inclusive
    val oneUntilTen = 1 until 10
    for (ii in oneUntilTen) {
        println("OneUntilTen $ii")
    }

    //10 .. 1 is an empty Range

    //Reverse
    val tenToOne = 10 downTo 1
    for (ii in tenToOne) {
        println("tenToOne $ii")
    }

    //Reverse step
    val tenToOneStep = 10 downTo 1 step 2
    for (ii in tenToOneStep) {
        println("tenToOneStep $ii")
    }

}

fun iteratingOverMaps() {
    println("Iterating Over Maps")

    val binaryReps = TreeMap<Char, String>()
    for (c in 'A' .. 'Z') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }
    for ((c, str) in binaryReps) {
        println("$c is $str")
    }

    val listIndex = listOf("Truco", "Seis", "Nove", "Doze")
    for ((index, value) in listIndex.withIndex())
        println("Vamo: $index $value")

}

fun usingInInColletions() {
    fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

    println("C is letter:  ${isLetter('C')}")
    println("> is letter:  ${isLetter('>')}")

    val listIndex = listOf("Truco", "Seis", "Nove", "Doze")

    println("Seis is a truco word:  ${"Seis" in listIndex}")
}