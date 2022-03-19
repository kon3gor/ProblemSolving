package cci.strings

class IsPermutation {

    fun solve(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) return false

        var hash1 = 0
        var hash2 = 0

        for (i in str1.indices) {
            hash1 += str1[i].toInt()
            hash2 += str2[i].toInt()
        }

        return hash1 == hash2
    }
}