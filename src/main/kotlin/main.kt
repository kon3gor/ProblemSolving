data class Test(val str: String, val i: Int)

fun Test.printSelf() {
    print(this.toString())
}

fun main(args: Array<String>) {
    val t = Test("", 0)
    t.printSelf()
    val s = Solution()
    print(buildString {
        s.countBits(2).forEach { append("$it, ") }
    })
}

class Solution {
    fun countBits(n: Int): IntArray {
        val result = IntArray(n + 1)
        var nearestPowOfTwo = 1
        for (i in 0..n) {
            if (i == nearestPowOfTwo) {
                result[i] = 1
                nearestPowOfTwo = nearestPowOfTwo shl 1
            } else {
                result[i] = result[nearestPowOfTwo shr 1] + result[i - (nearestPowOfTwo shr 1)]
            }
        }
        return result
    }
}