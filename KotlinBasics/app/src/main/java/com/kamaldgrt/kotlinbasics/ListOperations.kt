package com.kamaldgrt.kotlinbasics

fun main() {
    val fruitsList = mutableListOf("Apple", "Banana", "Grapes", "Guava", "Orange")
    println(fruitsList)

    fruitsList.add("Jack Fruit")
    println(fruitsList)

    fruitsList.remove("Guava")
    println(fruitsList)

    if (fruitsList.contains("Banana")) {
        println("Banana exists.")
    } else {
        println("Banana does not exist.")
    }
}
