package com.example.a_hashimoto.myapplication

open class Money(val amount: Int, private val currency: String) {

    open fun times(multiplier: Int): Money? {
        return Money(amount * multiplier, currency)
    }

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && currency() == money.currency()
    }

    fun currency(): String {
        return currency
    }

    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }

        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
}
