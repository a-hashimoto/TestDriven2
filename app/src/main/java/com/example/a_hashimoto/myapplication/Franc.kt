package com.example.a_hashimoto.myapplication

class Franc(franc: Int, currency: String) : Money(franc, "CHF"){

    override fun times(time: Int): Money {
        return Franc(time * amount, null)
    }
}