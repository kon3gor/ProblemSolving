package cci.arrays

class RotateImage {

    fun solve(matrix: Array<Array<Int>>) {
        translate(matrix)
        reverseRows(matrix)
    }

    private fun translate(matrix: Array<Array<Int>>) {
        for (i in matrix.indices) {
            for (j in i until matrix[i].size) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = tmp
            }
        }
    }

    private fun reverseRows(matrix: Array<Array<Int>>) {
        for (i in matrix.indices) {
            val iS = matrix[i].size
            for (j in 0 until iS / 2) {
                val tmp = matrix[i][j]
                matrix[i][j] = matrix[i][iS - j - 1]
                matrix[i][iS - j - 1] = tmp
            }
        }
    }

    fun bookSolve(matrix: Array<Array<Int>>) {
        val n = matrix.size
        for (layer in 0 until n/2) {
            val last = n - 1 - layer
            for (i in layer until last) {
                val offset = i - layer
                val top = matrix[layer][i]
                matrix[layer][i] = matrix[last - offset][layer]
                matrix[last - offset][layer] = matrix[last][last - offset]
                matrix[last][last - offset] = matrix[i][last]
                matrix[i][last] = top
            }
        }
    }
}