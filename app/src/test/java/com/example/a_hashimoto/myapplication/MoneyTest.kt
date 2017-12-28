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
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5) == Money.dollar(5))
        assertFalse(Money.dollar(5) == Money.dollar(6))
        assertFalse(Money.dollar(5) == Money.franc(5))
    }

    @Test
    fun testCurrency() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }

    @Test
    fun testSimpleAddition() {
        val five : Money = Money.dollar(5)
        val sum : Expression = five.plus(five)
        val bank = Bank()
        val reduced : Money = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(10),reduced)
    }

    @Test
    fun testPlusReturnsSum() {
        val five = Money(5, "USD")
        val result : Expression = five + five
        val sum : Sum = result as Sum
        assertEquals(five, sum.augend)
        assertEquals(five, sum.addend)
    }

    @Test
    fun testReduceSum () {
        var sum : Expression = Sum(Money.dollar(3) + Money.dollar(4))
        val bank = Bank()
        val result = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(7), result)
    }

}
