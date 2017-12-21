package com.example.a_hashimoto.myapplication

class Franc(fran: Int, currency: String) : Money(fran){

    override fun times(time: Int): Money {
        return franc(time * amount, null)
    }
}