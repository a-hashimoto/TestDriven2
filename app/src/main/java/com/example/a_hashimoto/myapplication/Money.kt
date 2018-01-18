package com.example.a_hashimoto.myapplication

class Money(val amount: Int, private val currency: String) : Expression {

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && currency() == money.currency()
    }

    override operator fun plus(addend: Expression): Expression {
        return Sum(this, addend)
    }

    override fun reduce(bank: Bank, to: String): Money {
        return Money(amount / bank.rate(currency, to), to)
    }

    operator fun times(multiplier: Int): Expression {
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
