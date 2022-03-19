package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IsTwoStringsOneModificationAwayTest {

    private val solver = IsTwoStringsOneModificationAway()

    @Test
    fun testCase1() {
        val str1 = "pale"; val str2 = "ple"
        assertTrue(solver.solve(str1, str2))
    }

    @Test
    fun testCase2() {
        val str1 = "pales"; val str2 = "pale"
        assertTrue(solver.solve(str1, str2))
    }

    @Test
    fun testCase3() {
        val str1 = "pale"; val str2 = "bale"
        assertTrue(solver.solve(str1, str2))
    }

    @Test
    fun testCase4() {
        val str1 = "pale"; val str2 = "bake"
        assertFalse(solver.solve(str1, str2))
    }

    @Test
    fun testCase5() {
        val str1 = "pale"; val str2 = "ble"
        assertFalse(solver.solve(str1, str2))
    }

    @Test
    fun testCase6() {
        val str1 = "ple"; val str2 = "pale"
        assertTrue(solver.solve(str1, str2))
    }

    @Test
    fun testCase7() {
        val str1 = "pale"; val str2 = "palecb"
        assertFalse(solver.solve(str1, str2))
    }

    @Test
    fun testCase8() {
        val str1 = "pale"; val str2 = "elap"
        assertFalse(solver.solve(str1, str2))
    }
}