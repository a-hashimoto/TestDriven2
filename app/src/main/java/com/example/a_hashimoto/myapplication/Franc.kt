package com.example.a_hashimoto.myapplication

class Franc(amount: Int, private val currency: String) : Money(amount, currency) {

    override fun times(time: Int): Money {
        return Franc(time * amount, currency)
    }
}