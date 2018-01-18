package com.example.a_hashimoto.myapplication

interface Expression {
    fun plus(addend: Expression): Expression
    fun reduce(bank: Bank, to: String): Money
}