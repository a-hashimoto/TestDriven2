package com.example.a_hashimoto.myapplication

class Dollar(amount: Int, currency: String) : Money(amount,currency){

    override fun times(time: Int): Money {
        return dollar(time * amount)
    }

}
