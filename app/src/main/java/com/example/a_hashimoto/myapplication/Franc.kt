package com.example.a_hashimoto.myapplication

class Franc(private var franc: Int) : Money(franc){

    fun times(time: Int): Franc {
        return Franc(time * amount)
    }
}