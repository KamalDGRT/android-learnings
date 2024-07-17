package com.kamaldgrt.kotlinbasics

fun main() {
    val constantNumber = 19
    var mutableString = "Nico"
    println(constantNumber)
    println(mutableString)
    mutableString = "Reyna"
    println(mutableString)

    val pi: Double = 3.141592653589793
    println(pi)

    val myTrue = true
    val myFalse = false
    println(myTrue || myFalse) // true
    println(myTrue && myFalse) // false
    println(!myTrue)           // false
}
