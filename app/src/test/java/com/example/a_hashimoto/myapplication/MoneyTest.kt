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
        var five: Money = Money.dollar(5, null)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality(){
        assertTrue(Money.dollar(5) == Money.dollar(5))
        assertFalse(Money.dollar(5) == Money.dollar(6))
        assertTrue(Money.franc(5) == Money.franc(5))
        assertFalse(Money.franc(5) == Money.franc(6))
        assertFalse(Money.dollar(5) as Money == Money.franc(5) as Money)
    }

    @Test
    fun testFrancMultiplication() {
        val franc: Money = Money.franc(5)
        assertEquals(Money.franc(10), franc.times(2))
        assertEquals(Money.franc(15), franc.times(3))
    }

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }
}
