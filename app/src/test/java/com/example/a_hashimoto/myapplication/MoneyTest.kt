package com.example.a_hashimoto.myapplication

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MoneyTest {
    val usd = "USD"
    val chf = "CHF"
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
        assertEquals(usd, Money.dollar(1).currency())
        assertEquals(chf, Money.franc(1).currency())
    }

    @Test
    fun testSimpleAddition() {
        val five: Money = Money.dollar(5)
        val sum: Expression = five.plus(five)
        val bank = Bank()
        val reduced: Money = bank.reduce(sum, usd)
        assertEquals(Money.dollar(10), reduced)
    }

    @Test
    fun testPlusReturnsSum() {
        val five = Money(5, usd)
        val result: Expression = five + five
        val sum: Sum = result as Sum
        assertEquals(five, sum.augend)
        assertEquals(five, sum.addend)
    }

    @Test
    fun testReduceSum() {
        var sum: Expression = Sum(Money.dollar(3), Money.dollar(4))
        val bank = Bank()
        val result = bank.reduce(sum, usd)
        assertEquals(Money.dollar(7), result)
    }

    @Test
    fun testReduceMoney() {
        val bank = Bank()
        val result = bank.reduce(Money.dollar(1), usd)
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testReduceMoneyDifferentCurrency() {
        val bank = Bank()
        bank.addRate(chf, usd, 2)
        val result = bank.reduce(Money.franc(2), usd)
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testIdentityRate() {
        assertEquals(1, Bank().rate(usd, usd))
    }

    @Test
    fun testMixedAddition() {
        val fiveBucks: Expression = Money.dollar(5)
        val tenFrancs: Expression = Money.franc(10)
        val bank = Bank()
        bank.addRate(chf, usd, 2)
        val result = bank.reduce(fiveBucks.plus(tenFrancs), usd)
        assertEquals(Money.dollar(10), result)
    }

    @Test
    fun testSumPlusMoney() {
        val fiveBucks = Money.dollar(5)
        val tenFrancs = Money.franc(10)
        val bank = Bank()
        bank.addRate(chf,usd,2)
        val sum = Sum(fiveBucks, tenFrancs).plus(fiveBucks)
        val result = bank.reduce(sum, usd)
        assertEquals(Money.dollar(15), result)
    }

}
