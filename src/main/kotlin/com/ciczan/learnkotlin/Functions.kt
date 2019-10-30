package com.ciczan.learnkotlin

fun String.invertido() : String = reversed()

fun main(args: Array<String>) {

    //Declarations
    val set = hashSetOf(1, 7, 53)
    println(set.javaClass)
    val list = arrayListOf(1, 7, 53)
    println(list.javaClass)
    val map = hashMapOf(1 to "One", 7 to "Seven", 53 to "Fifty Three")
    println(map.javaClass)

    val strings = listOf("first", "second", "fourteenth")
    strings.last()

    //Extension Method
    println("Massimo Zandona".invertido())

     "truco, seis, nove, doze".split(", ")

}