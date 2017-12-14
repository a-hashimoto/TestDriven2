package com.example.a_hashimoto.myapplication

class Dollar(dollar: Int) : Money(dollar){

    override fun times(time: Int): Money {
        return Dollar(time * amount)
    }

}
