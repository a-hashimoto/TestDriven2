package com.example.a_hashimoto.myapplication

class Dollar(dollar: Int) : Money(dollar){

    fun times(time: Int): Dollar {
        return Dollar(time * amount)
    }

}
