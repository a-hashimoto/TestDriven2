package com.example.a_hashimoto.myapplication

class Franc(amount: Int) : Money(amount, "CHF"){

    override fun times(time: Int): Money {
        return franc(time * amount)
    }
}