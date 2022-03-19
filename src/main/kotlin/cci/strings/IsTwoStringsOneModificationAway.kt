package cci.strings

import kotlin.math.abs

class IsTwoStringsOneModificationAway {

    fun solve(str1: String, str2: String): Boolean {

        return when {
            str1.length == str2.length -> oneEdit(str1, str2)
            abs(str1.length - str2.length) == 1 -> oneInsert(str2, str1)
            else -> false
        }
    }

    private fun oneEdit(s1: String, s2: String): Boolean {
        var hasDiff = false
        for (i in s1.indices) {
            if (s1[i] != s2[i]) {
                if (hasDiff) return false
                hasDiff = true
            }
        }

        return true
    }

    private fun oneInsert(s1: String, s2: String): Boolean {
        val big: String; val small: String
        if (s1.length > s2.length) {
            big = s1; small = s2
        } else {
            big = s2; small = s1
        }
        var i = -1; var j = -1
        var hasDiff = false
        while (++i < big.length && ++j < small.length) {
            if (big[i] != small[j]) {
                if (hasDiff) return false
                hasDiff = true
                j--
            }
        }

        return true
    }
}