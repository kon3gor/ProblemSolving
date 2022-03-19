package cci.strings

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class IsRotationTest {

    private val solver = IsRotation()

    @Test
    fun testCase1(){
        val s1 = "waterbottle"
        val s2 = "erbottlewat"
        assertTrue(solver.solve(s1, s2))
    }

    @Test
    fun testCase2(){
        val s1 = "waterbottle"
        val s2 = "errbottlewat"
        assertFalse(solver.solve(s1, s2))
    }

    @Test
    fun testCase3(){
        val s1 = "nicecake"
        val s2 = "icecaken"
        assertTrue(solver.solve(s1, s2))
    }
}