class CoolHeap<T>(
    value: T,
    private val comparator: Comparator<T>,
) {

    private val arr = ArrayList<T>()
    val size get() = arr.size

    init {
        arr.add(value)
    }

    fun add(value: T) {
        arr.add(value)
        bubbleUpValueAt(size - 1)
    }

    private fun bubbleUpValueAt(ind: Int) {
        var index = ind
        var parentIndex = getParentIndexFor(index)
        while (comparator.compare(arr[parentIndex], arr[index]) == 1) {
            swap(parentIndex, index)
            index = parentIndex
            parentIndex = getParentIndexFor(index)

            if (parentIndex < 0) break
        }
    }

    private fun getParentIndexFor(index: Int): Int {
        val sub = if (index % 2 != 0) 1 else 2
        return (index - sub)/2
    }

    fun poll(): T {
        swap(0, size - 1)
        val valueToRemove = arr.removeAt(size - 1)
        bubbleDownValueAt(0)
        return valueToRemove
    }

    private fun bubbleDownValueAt(ind: Int) {
        var index = ind
        var lessChildIndex = getLessChildOf(index) ?: return
        while (comparator.compare(arr[lessChildIndex], arr[index]) == -1) {
            swap(index, lessChildIndex)
            index = lessChildIndex
            lessChildIndex = getLessChildOf(index) ?: break
        }
    }

    private fun getLessChildOf(index: Int): Int? {
        val leftChild = if ((2*index + 1) >= size) {
            null
        } else {
            arr[2*index + 1]
        } ?: return null
        val rightChild = if ((2*index + 2) >= size)  {
            null
        } else {
            arr[2*index + 2]
        } ?: leftChild

        return 2*index + if (comparator.compare(rightChild, leftChild) == -1) {
            2
        } else {
            1
        }
    }

    private fun swap(i1: Int, i2: Int) {
        val tmp = arr[i1]
        arr[i1] = arr[i2]
        arr[i2] = tmp
    }

    override fun toString(): String {
        return buildString {
            append('[')
            for (i in arr.subList(0, arr.lastIndex)) {
                append("$i, ")
            }
            append(arr[arr.lastIndex].toString())
            append(']')
        }
    }
}