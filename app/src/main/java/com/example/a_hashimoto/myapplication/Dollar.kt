package com.example.a_hashimoto.myapplication

import java.util.*

class Dollar(int: Int) {
    var amount: Int = 0

    init {
        amount = int
    }

    fun times(time: Int) : Dollar{
        return Dollar(time * amount)
    }
    fun equals(dollar: Dollar) : Boolean{
        return amount == dollar.amount
    }
}
