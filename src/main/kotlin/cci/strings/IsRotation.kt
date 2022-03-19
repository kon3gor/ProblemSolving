package cci.strings

class IsRotation {

    fun solve(str1: String, str2: String): Boolean {
        if (str1.length == str2.length) {
            return (str1 + str2).contains(str2)
        }

        return false
    }
}