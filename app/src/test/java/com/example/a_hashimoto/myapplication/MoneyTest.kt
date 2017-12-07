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
        assertEquals(Dollar(10), five.times(2))
        assertEquals(Dollar(15), five.times(3))
    }

    @Test
    fun testEquality(){
        assertTrue(Dollar(5) == Dollar(5))
        assertFalse(Dollar(5) == Dollar(6))
    }

    @Test
    fun testFrancMultiplication() {
        var five: Franc = Franc(5)
        assertEquals(Franc(10), five.times(2))
        assertEquals(Franc(15), five.times(3))
    }
}
