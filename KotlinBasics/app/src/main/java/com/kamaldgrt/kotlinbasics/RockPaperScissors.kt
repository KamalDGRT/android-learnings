package com.kamaldgrt.kotlinbasics

fun main() {
    print("R, P, S - choose one : ")
    val userChoice = readln()
    var computerChoice = ""

    val randomNumber = (1 .. 3).random()

    computerChoice = when (randomNumber) {
        1 -> "R"
        2 -> "P"
        else -> "S"
    }
    println("Computer's Choice: $computerChoice")
    val winner = when {
        userChoice == computerChoice -> "Tie"
        userChoice == "R" && computerChoice == "S" -> "Player"
        userChoice == "P" && computerChoice == "R" -> "Player"
        userChoice == "S" && computerChoice == "P" -> "Player"
        else -> "Computer"
    }

    println("Outcome: $winner")
}