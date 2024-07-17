package com.kamaldgrt.kotlinbasics

fun main() {
    print("Enter your age as a whole number: ")
    val userAge = readln().toInt()

//    if ( userAge >= 40) {
//        println("You cannot go into the club, please go home.")
//    } else if (userAge >= 18) {
//        println("You can enter the club.")
//    } else {
//        println("Age not verified. Please contact support.")
//    }

    if (userAge in 18..39) {
        println("You can enter the club.")
    }
}