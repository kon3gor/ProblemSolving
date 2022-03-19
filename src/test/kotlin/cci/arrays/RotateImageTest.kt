package cci.arrays

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RotateImageTest {

    private val solver = RotateImage()

    @Test
    fun testCase1() {
        val matrix = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9),
        )

        val expected = arrayOf(
            arrayOf(7, 4, 1),
            arrayOf(8, 5, 2),
            arrayOf(9, 6, 3),
        )
        solver.solve(matrix)
        assertArrayEquals(expected, matrix)
    }

    @Test
    fun testCase2() {
        val matrix = arrayOf(
            arrayOf(1, 2, 3, 4),
            arrayOf(5, 6, 7, 8),
            arrayOf(9, 10, 11, 12),
            arrayOf(13, 14, 15, 16),
        )

        val expected = arrayOf(
            arrayOf(13, 9, 5, 1),
            arrayOf(14, 10, 6, 2),
            arrayOf(15, 11, 7, 3),
            arrayOf(16, 12, 8, 4),
        )
        solver.solve(matrix)
        assertArrayEquals(expected, matrix)
    }
}