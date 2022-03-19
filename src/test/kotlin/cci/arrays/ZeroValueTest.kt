package cci.arrays

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ZeroValueTest {

    private val solver = ZeroValue()

    @Test
    fun testCase1() {
        val matrix = arrayOf(
            arrayOf(1, 0, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9),
        )

        val expected = arrayOf(
            arrayOf(0, 0, 0),
            arrayOf(4, 0, 6),
            arrayOf(7, 0, 9),
        )
        solver.solve(matrix)
        assertArrayEquals(expected, matrix)
    }

    @Test
    fun testCase2() {
        val matrix = arrayOf(
            arrayOf(1, 0, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 0, 9),
        )

        val expected = arrayOf(
            arrayOf(0, 0, 0),
            arrayOf(4, 0, 6),
            arrayOf(0, 0, 0),
        )
        solver.solve(matrix)
        assertArrayEquals(expected, matrix)
    }

    @Test
    fun testCase3() {
        val matrix = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(5, 0, 7),
            arrayOf(9, 10, 11),
            arrayOf(13, 14, 0),
        )

        val expected = arrayOf(
            arrayOf(1, 0, 0),
            arrayOf(0, 0, 0),
            arrayOf(9, 0, 0),
            arrayOf(0, 0, 0),
        )
        solver.solve(matrix)
        assertArrayEquals(expected, matrix)
    }
}