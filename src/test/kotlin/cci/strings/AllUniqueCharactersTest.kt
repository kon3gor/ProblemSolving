package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AllUniqueCharactersTest {

    private val solver = AllUniqueCharacters()

    @Test
    fun `all unique`() {
        val str = "abcdf"
        val result = solver.solve(str)
        assertTrue(result)
    }

    @Test
    fun `not all unique`() {
        val str = "abbcs"
        val result = solver.solve(str)
        assertFalse(result)
    }

    @Test
    fun `single char string`() {
        val str = "a"
        val result = solver.solve(str)
        assertTrue(result)
    }

    @Test
    fun `empty string`() {
        val result = solver.solve("")
        assertTrue(result)
    }
}