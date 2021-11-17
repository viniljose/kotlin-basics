package com.vinil.kotlin

fun main(args: Array<String>){
    val options = arrayOf("Rock","Paper","Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(gameChoice,userChoice)
}

fun getGameChoice(optionsParam : Array<String>) =  optionsParam[(Math.random()*optionsParam.size).toInt()]

fun getUserChoice(optionsParam : Array<String>) :String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        println("Please Choose one of the following")
        for(item in optionsParam) print(" $item")
        println(".")
        val userInput = readLine()
        if(userInput != null && userInput in optionsParam){
            userChoice = userInput
            isValidChoice = true
        }
        if(!isValidChoice)
            println("You must enter a valid choice")
    }
    return userChoice
}

fun printResult(gameChoice : String,userChoice : String){
    val result :String
    if(gameChoice == userChoice) result = "Tie..!!!"
    else if (userChoice == "Rock" && gameChoice == "Scissors"
        || userChoice == "Paper" && gameChoice == "Rock"
        || userChoice == "Scissors" && gameChoice == "Paper") result = "You Won..!!!!"
    else result = "You Lose"
    println("You Chose $userChoice and I chose $gameChoice So $result")
}
