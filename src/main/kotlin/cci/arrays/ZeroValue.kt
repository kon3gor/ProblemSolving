package cci.arrays

class ZeroValue {

    fun solve(matrix: Array<Array<Int>>) {

        var rowHasZero = false
        var columnHasZero = false

        for (i in matrix.indices) {
            if (matrix[i][0] == 0) {
                columnHasZero = true
                break
            }
        }

        for (i in matrix[0].indices) {
            if (matrix[0][i] == 0) {
                rowHasZero = true
                break
            }
        }

        for (i in 1 until matrix.size) {
            for (j in 1 until matrix[i].size) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0; matrix[i][0] = 0
                }
            }
        }

        for (i in matrix.indices) {
            if (matrix[i][0] == 0) zerofyRow(matrix, i)
        }

        for (i in matrix[0].indices) {
            if (matrix[0][i] == 0) zerofyColumn(matrix, i)
        }

        if (rowHasZero) zerofyRow(matrix, 0)
        if (columnHasZero) zerofyColumn(matrix, 0)
    }

    private fun zerofyRow(matrix: Array<Array<Int>>, rowIndex: Int) {
        for (i in matrix[rowIndex].indices) {
            matrix[rowIndex][i] = 0
        }
    }

    private fun zerofyColumn(matrix: Array<Array<Int>>, columnIndex: Int) {
        for (i in matrix.indices) {
            matrix[i][columnIndex] = 0
        }
    }
}