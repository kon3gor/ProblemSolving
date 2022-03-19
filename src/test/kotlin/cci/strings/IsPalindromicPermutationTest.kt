package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IsPalindromicPermutationTest {

    private val solver = IsPalindromicPermutation()

    @Test
    fun testCase1() {
        val str = "Tact Coa"
        val r = solver.solve(str)
        assertTrue(r)
    }

    @Test
    fun testCase2() {
        val str = "abab"
        val r = solver.solve(str)
        assertTrue(r)
    }

    @Test
    fun testCase3() {
        val str = "aBAb"
        val r = solver.solve(str)
        assertTrue(r)
    }

    @Test
    fun testCase4() {
        val str = "normal string"
        val r = solver.solve(str)
        assertFalse(r)
    }

    @Test
    fun testCase5() {
        val str = ""
        val r = solver.solve(str)
        assertTrue(r)
    }

    @Test
    fun testCase6() {
        val str = "abcdab"
        val r = solver.solve(str)
        assertFalse(r)
    }
}