package com.example.a_hashimoto.myapplication

import java.util.HashMap

class Bank {

    internal var rates: HashMap<Pair<String, String>, Int> = HashMap()

    fun reduce(source : Expression, to : String) : Money {
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates.put(Pair(from, to), rate)
    }

    fun rate(from: String, to: String) : Int{
        if (from.equals(to)) return 1
        return rates.get(Pair(from, to)) ?: 1
    }
}