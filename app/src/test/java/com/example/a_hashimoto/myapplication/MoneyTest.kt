package com.example.a_hashimoto.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MoneyTest {
    @Test
    fun testMultiplication() {
        Dollar five = new Dollar(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}
