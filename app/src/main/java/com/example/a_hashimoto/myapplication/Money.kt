package com.example.a_hashimoto.myapplication

abstract class Money(var amount: Int) {

    abstract fun times(time: Int) :Money

    abstract fun currency() : String

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && this::class == money::class
    }


    companion object {
        fun dollar(amount: Int) : Dollar{
            return Dollar(amount)
        }

        fun franc(amount: Int) : Franc{
            return Franc(amount)
        }
    }
}
