package com.example.a_hashimoto.myapplication

interface Expression {
    fun reduce(bank: Bank, to: String): Money
}