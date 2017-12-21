package com.example.a_hashimoto.myapplication

class Dollar(dollar: Int, currency: String) : Money(dollar, "USD"){

    override fun times(time: Int): Money {
        return Dollar(time * amount, null)
    }

}
