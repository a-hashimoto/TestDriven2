package com.example.a_hashimoto.myapplication

class Dollar(private var dollar: Int) : Money(dollar){

    fun times(time: Int): Dollar {
        return Dollar(time * amount)
    }

}
