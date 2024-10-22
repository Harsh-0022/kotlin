package com.example.myfirstapp.ui.theme
fun main(){
    var computerChoice=""
    var userChoice=""
    println("Rock ,paper, Scissors")
    val choices= arrayListOf("Rock","Paper","Scissors")
    userChoice= readln()
    //randomly generating cases
    when((1..3).random()) {
        1 -> {
            computerChoice = "Rock"
        }

        2 -> {
            computerChoice = "Paper"
        }

        3 -> {
            computerChoice = "Scissors"
        }
    }
    //logic
    if(choices.contains(userChoice)){
        val winner=when{
            computerChoice==userChoice ->"Tie"
            userChoice=="Rock"&&computerChoice=="Paper" ->"Player"
            userChoice=="Paper"&&computerChoice=="Rock" ->"Player"
            userChoice=="Scissors"&&computerChoice=="Paper" ->"Player"
            else ->"Computer"
        }
        if(winner=="Tie"){
            println("Match Drawn $userChoice was chosen")
        }else{
            println("$winner won")
        }
    }else{
        println("Wrong Input")
    }
}