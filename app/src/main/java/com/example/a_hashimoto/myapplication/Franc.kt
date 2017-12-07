package com.example.a_hashimoto.myapplication

class Franc(franc: Int) : Money(franc){

    fun times(time: Int): Franc {
        return Franc(time * amount)
    }
}