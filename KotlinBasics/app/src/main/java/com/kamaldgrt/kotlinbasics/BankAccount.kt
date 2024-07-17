package com.kamaldgrt.kotlinbasics

class BankAccount(
    var accountHolder: String,
    var balance: Double
) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        balance += amount
        //balance = balance + amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withdraw(amount: Double) {
        if (amount <= balance) {
            // we can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        } else {
            // we cannot withdraw money
            println("You don't have the funds to withdraw $$amount")
        }
    }

    fun displayTransactionHistory() {
        println("Transaction history for $accountHolder")
        for (transaction in transactionHistory) {
            println(transaction)
        }
    }

    fun acctBalance(): Double {
        return balance
    }
}

fun main() {
    val nicoBankAccount = BankAccount("Nico di Angelo", 1338.20)

    nicoBankAccount.deposit(200.0)
    nicoBankAccount.withdraw(1200.00)
    nicoBankAccount.deposit(3000.00)
    nicoBankAccount.deposit(2000.00)
    nicoBankAccount.withdraw(3333.15)

    nicoBankAccount.displayTransactionHistory()
    println("${nicoBankAccount.accountHolder}'s " +
            "balance is ${nicoBankAccount.acctBalance()}\n\n")

    val sarahAccount = BankAccount("Sarah", 0.0)
    sarahAccount.deposit(100.0)
    sarahAccount.withdraw(10.0)
    sarahAccount.deposit(300.0)
    sarahAccount.displayTransactionHistory()
    println("${sarahAccount.accountHolder}'s " +
            "balance is ${sarahAccount.acctBalance()}")
}