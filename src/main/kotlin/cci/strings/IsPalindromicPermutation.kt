package cci.strings

class IsPalindromicPermutation {

    fun solve(str: String): Boolean {
        val m = mutableMapOf<Char, Int>()
        var oddCounter = 0
        str.forEach {
            if (it != ' ') {
                val c = it.toLowerCase()
                m[c] = (m[c] ?: 0) + 1
                if (m[c]!!%2 == 0) {
                    oddCounter--
                } else {
                    oddCounter++
                }
            }
        }
        return oddCounter <= 1
    }
}