package com.example.a_hashimoto.myapplication

class Franc(franc: Int) : Money(franc){

    fun times(time: Int): Money {
        return Franc(time * amount)
    }
}