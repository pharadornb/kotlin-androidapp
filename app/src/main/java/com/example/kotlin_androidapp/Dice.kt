package com.example.kotlin_androidapp

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}