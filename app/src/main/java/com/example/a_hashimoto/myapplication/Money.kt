package com.example.a_hashimoto.myapplication

abstract class Money(var amount: Int, var currency: String) {

    abstract fun times(time: Int) :Money

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && this::class == money::class
    }


    companion object {
        fun dollar(amount: Int, currency: String) : Dollar{
            return Dollar(amount, null)
        }

        fun franc(amount: Int, currency: String) : Franc{
            return Franc(amount, null)
        }
    }
}
