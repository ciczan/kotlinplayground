package com.ciczan.learnkotlin.classes

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

//Objects Declarations: class declaration + single instance
object UniqueResource {
//This would not compile (constructor): object UniqueResource(param1: String)

    //Can have fields
    internal var counter = 0

    fun sendMessage(message: String) {
        counter++
        println("Message: "+ message)
    }

}

//Objects can implement interfaces and extend methods
object UniqueRunner : Runnable {

    internal var counter = 0

    override fun run() {
        println("From another thread, but the same object... ${counter++}")
    }

}

fun main(args: Array<String>) {

    UniqueResource.sendMessage("Truco")
    println(UniqueResource.counter)

    val pool =Executors.newFixedThreadPool(100)
    pool.submit(UniqueRunner)
    pool.submit(UniqueRunner)
    pool.submit(UniqueRunner)
    pool.awaitTermination(10, TimeUnit.SECONDS)

}
