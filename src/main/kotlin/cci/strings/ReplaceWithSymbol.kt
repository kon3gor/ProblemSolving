package cci.strings

class ReplaceWithSymbol {

    fun solve(str: CharArray, actualLen: Int) {
        var i = actualLen - 1
        var endIndex = str.size - 1
        while (i >= 0) {
            if (str[i] == ' ') {
                str[endIndex] = '0'
                str[endIndex - 1] = '2'
                str[endIndex - 2] = '%'
                endIndex -= 3
            } else {
                str[endIndex] = str[i]
                endIndex--
            }
            i--
        }
    }
}