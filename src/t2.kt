fun main() {

    var arr: Array<Array<Int>> = Array(5) {
        Array(5) {
            0
        }
    }
    var cn = 0
    var num = arrayOf(5, 9, 6, 7, 2, 9, 8, 4, 5, 3, 6, 4, 3, 8, 7, 7, 5, 8, 4, 8, 2, 3, 7, 8, 1)
    for (i in 0..4) {
        for (j in 0..4) {
            arr[i][j] = num[cn]
            print(arr[i][j])
            print(" ")
            cn++
        }
        println()
    }
    var tf : Boolean = true
    for (i in 0..4) {
        for (j in 0..4) {
            if (i == j) {}
            else if (arr[i][j] != arr[j][i]) {
                tf = false
                break
            }
        }
    }
    if (tf) {
        print("является симметричным относительно главной диагонали")
    }
    else {
        print("не является симметричным относительно главной диагонали")
    }

}