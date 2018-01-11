package com.example.a_hashimoto.myapplication

class Bank {
    fun reduce(source : Expression, to : String) : Money {
        return source.reduce(to)
    }
}