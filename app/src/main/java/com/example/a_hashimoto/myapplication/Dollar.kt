package com.example.a_hashimoto.myapplication

class Dollar(amount: Int, private val currency: String) : Money(amount,currency){

    override fun times(time: Int): Money {
        return Dollar(time * amount, currency)
    }

}
