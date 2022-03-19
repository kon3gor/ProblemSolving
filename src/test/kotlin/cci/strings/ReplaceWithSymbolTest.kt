package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReplaceWithSymbolTest {

    private val solver = ReplaceWithSymbol()

    @Test
    fun testCase1() {
        val str = "Mr John Smith    ".toCharArray()
        val actualLen = 13
        solver.solve(str, actualLen)
        assertEquals("Mr%20John%20Smith", str.joinToString(""))
    }

    @Test
    fun testCase2() {
        val str = "Mr John  ".toCharArray()
        val actualLen = 7
        solver.solve(str, actualLen)
        assertEquals("Mr%20John", str.joinToString(""))
    }

    @Test
    fun testCase3() {
        val str = "Mr John     ".toCharArray()
        val actualLen = 8
        val r = solver.solve(str, actualLen)
        assertEquals("Mr%20John%20", str.joinToString(""))
    }

    @Test
    fun testCase4() {
        val str = " Mr John    ".toCharArray()
        val actualLen = 8
        solver.solve(str, actualLen)
        assertEquals("%20Mr%20John", str.joinToString(""))
    }

    @Test
    fun testCase5() {
        val str = "Mr  John    ".toCharArray()
        val actualLen = 8
        solver.solve(str, actualLen)
        assertEquals("Mr%20%20John", str.joinToString(""))
    }
}