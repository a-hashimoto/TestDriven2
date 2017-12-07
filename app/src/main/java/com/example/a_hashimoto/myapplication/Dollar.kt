package com.example.a_hashimoto.myapplication

class Dollar(private var amount: Int = 0) {

    fun times(time: Int): Dollar {
        return Dollar(time * amount)
    }

    override fun equals(other: Any?): Boolean {
        val dollar: Dollar = other as Dollar
        return amount == dollar.amount
    }
}
