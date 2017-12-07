package com.example.a_hashimoto.myapplication

class Franc(private var amount: Int = 0) {

    fun times(time: Int): Franc {
        return Franc(time * amount)
    }

    override fun equals(other: Any?): Boolean {
        val dollar: Franc = other as Franc
        return amount == dollar.amount
    }
}