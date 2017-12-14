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
        var five: Money = Money.dollar(5)
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality(){
        val franc = Money.dollar(5)
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar(6))
        assertTrue(Franc(5) == Franc(5))
        assertFalse(Franc(5) == Franc(6))
        assertFalse(Dollar(5) as Money == Franc(5) as Money)
    }

    @Test
    fun testFrancMultiplication() {
        var five: Franc = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }
}
