package com.example.a_hashimoto.myapplication

open class Money(var amount: Int){

    override fun equals(other: Any?): Boolean {
        val money: Money = other as Money
        return amount == money.amount
    }
}
