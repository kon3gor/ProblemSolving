package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IsPermutationTest {

    private val solver = IsPermutation()

    @Test
    fun `simple permutation`(){
        val str1 = "abc"
        val str2 = "cab"
        val r = solver.solve(str1, str2)
        assertTrue(r)
    }

    @Test
    fun `different length`() {
        val str1 = "abcd"
        val str2 = "cab"
        val r = solver.solve(str1, str2)
        assertFalse(r)
    }

    @Test
    fun `equal length but different repeating chars`() {
        val str1 = "aab"
        val str2 = "abb"
        val r = solver.solve(str1, str2)
        assertFalse(r)
    }

    @Test
    fun `empty strings`() {
        val str1 = ""
        val str2 = ""
        val r = solver.solve(str1, str2)
        assertTrue(r)
    }
}