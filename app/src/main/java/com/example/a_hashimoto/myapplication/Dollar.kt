package com.example.a_hashimoto.myapplication

class Dollar(amount: Int) : Money(amount, "USD"){

    override fun times(time: Int): Money {
        return Dollar(time * amount)
    }

}
