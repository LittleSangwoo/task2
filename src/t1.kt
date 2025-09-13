fun main() {
    print("Введите количество строк: ")
    var n: Int = readln().toInt()
    print("Введите количество столбцов: ")
    var m: Int = readln().toInt()
    var arr: Array<IntArray> = Array(n) { IntArray(m) }

    var arrOfNum: Array<Int> = Array(n * m) { 0 }
    var x = 0
    while (x < n*m) {
        print("Введите число: ")
        arrOfNum[x] = readln().toInt()
        x++
    }
    var z = 0
    var l = 0
    var count = 0
    var tf: Boolean = true
    var arrOfNum2: Array<Int> = Array(10) { -1}
    for (i in 0 until n*m) {
        z = arrOfNum[i]
        while (z > 0) {
            for(j in 0 until arrOfNum2.count()) {
                if (z % 10 == arrOfNum2[j]) {
                    tf = false
                    break
                }
            }
            if (tf) {
                arrOfNum2[l] = z % 10
                l++
                count++
                for (h in 0 until arrOfNum2.count()) {
                }
                println()
            }
            z /= 10
            tf = true
        }
    }
    print("В массиве использовано $count различных цифр")
}