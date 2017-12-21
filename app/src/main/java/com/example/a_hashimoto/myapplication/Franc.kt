package com.example.a_hashimoto.myapplication

class Franc(amount: Int, currency: String) : Money(amount, currency) {

    override fun times(time: Int): Money {
        return franc(time * amount)
    }
}