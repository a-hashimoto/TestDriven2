package com.example.a_hashimoto.myapplication

interface Expression {
    fun times(multiplier: Int): Expression
    fun plus(addend: Expression): Expression
    fun reduce(bank: Bank, to: String): Money
}