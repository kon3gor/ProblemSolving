package cci.strings

class SimpleStringCompression {

    fun solve(str: String): String {
        var counter = 0
        val builder = StringBuilder()
        str.forEachIndexed { ind, char ->
            val nextInd = ind + 1
            counter++
            if (nextInd >= str.length || str[nextInd] != char ) {
                builder.append(char)
                builder.append(counter)
                counter = 0
            }
        }
        val r = builder.toString()
        return if (r.length > str.length) str else r
    }
}