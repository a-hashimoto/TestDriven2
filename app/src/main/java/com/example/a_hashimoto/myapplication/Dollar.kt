package com.example.a_hashimoto.myapplication

class Dollar(dollar: Int) : Money(dollar){
    val currency = "USD"
    override fun currency(): String {
        return currency
    }

    override fun times(time: Int): Money {
        return Dollar(time * amount)
    }

}
