package com.example.a_hashimoto.myapplication

class Dollar(dol: Int, currency: String) : Money(dol){

    override fun times(time: Int): Money {
        return Dollar(time * amount, null)
    }

}
