package com.example.a_hashimoto.myapplication

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MoneyTest {
    @Test
    fun testMultiplication() {
        var five: Dollar = Dollar(5)
        var product: Dollar
        product = five.times(2)
        assertEquals(10, product.amount)
        product = five.times(3)
        assertEquals(15, product.amount)
    }

    @Test
    fun testEquality(){
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar(6))
    }
}
