package com.kamaldgrt.kotlinbasics

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    for (index in 0 until numbers.size) {
        println("The number at index - $index = ${numbers[index]}")

        numbers[index] = numbers[index] * 2
        println("Doubled Number = ${numbers[index]}")
        println()
    }

    println(numbers)
}