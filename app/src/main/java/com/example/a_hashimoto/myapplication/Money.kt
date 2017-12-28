package com.example.a_hashimoto.myapplication

class Money(private val amount: Int, private val currency: String) : Expression{

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && currency() == money.currency()
    }

    operator fun plus(addend : Money) : Expression {
        return Sum(this, addend)
    }

    operator fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
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
