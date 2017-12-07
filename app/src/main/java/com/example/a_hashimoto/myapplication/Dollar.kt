package com.example.a_hashimoto.myapplication

class Dollar(int: Int) {
    private var amount: Int = 0

    init {
        amount = int
    }

    fun times(time: Int): Dollar {
        return Dollar(time * amount)
    }

    override fun equals(other: Any?): Boolean {
        val dollar: Dollar = other as Dollar
        return amount == dollar.amount
    }
}
