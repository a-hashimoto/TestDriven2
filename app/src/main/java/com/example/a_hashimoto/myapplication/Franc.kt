package com.example.a_hashimoto.myapplication

class Franc(franc: Int) : Money(franc){

    val currency : String = "CHF"
    override fun currency(): String {
        return currency
    }

    override fun times(time: Int): Money {
        return Franc(time * amount)
    }
}