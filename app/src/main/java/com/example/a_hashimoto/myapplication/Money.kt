package com.example.a_hashimoto.myapplication

abstract class Money(var amount: Int) {

    abstract fun times(time: Int) :Money

    override fun equals(other: Any?): Boolean {
        val money: Money? = other as? Money
        return amount == money?.amount
                && this::class == money::class
    }


    companion object {
        fun dollar(amount: Int) : Money{
            return Dollar(amount)
        }
    }
}
