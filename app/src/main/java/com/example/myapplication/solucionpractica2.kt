package com.example.myapplication

fun main (){
    val edad = 41
        if (edad < 18){
            println("lo siento no puedes consumir")
        }
        else if (edad >= 18 && edad < 40){
            println("toma con moderacion")
        }
    else{
        println("Si puedes consumir \nDe cual vas a querer amix")
    }
}