package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SimpleStringCompressionTest {

    private val solver = SimpleStringCompression()

    @Test
    fun testCase1() {
        val str = "aabbcccccaaa"
        assertEquals("a2b2c5a3", solver.solve(str))
    }

    @Test
    fun testCase2() {
        val str = "aaaaa"
        assertEquals("a5", solver.solve(str))
    }

    @Test
    fun testCase3() {
        val str = "ababab"
        assertEquals("ababab", solver.solve(str))
    }

    @Test
    fun testCase4() {
        val str = ""
        assertEquals("", solver.solve(str))
    }

    @Test
    fun testCase5() {
        val str = "aaaaab"
        assertEquals("a5b1", solver.solve(str))
    }
}