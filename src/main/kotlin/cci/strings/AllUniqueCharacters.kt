package cci.strings

class AllUniqueCharacters {

    fun solve(str: String): Boolean {
        var checker = 0
        for (i in str) {
            val v = i.toInt() - 'a'.toInt()
            if ((checker and (1 shl v)) > 0) return false

            checker = checker or (1 shl v)
        }

        return true
    }
}