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
        var five : Dollar = Dollar(5)
        var product : Dollar  = five.times(2)
        assertEquals(10, five.amount)
        product = five.times(3)
        assertEquals(15, five.amount)
    }
}
