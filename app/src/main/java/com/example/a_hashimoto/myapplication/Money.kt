package com.example.a_hashimoto.myapplication

abstract class Money(val amount: Int, private val currency: String) {

    abstract fun times(time: Int): Money

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && this::class == money::class
    }

    fun currency(): String {
        return currency
    }


    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }
}
