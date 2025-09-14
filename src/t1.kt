fun main() {
    print("Введите количество строк: ")
    var n: Int = readln().toInt()
    print("Введите количество столбцов: ")
    var m: Int = readln().toInt()
    if (n <= 0 && m <= 0 )
    {
        print("Ошибка, число < 0")
    }
    else {
        var arrOfNum: Array<Int> = Array(n * m) { 0 }
        var x = 0
        while (x < n * m) {
            try {
                print("Введите трехзначное число: ")
                arrOfNum[x] = readln().toInt()

                if (arrOfNum[x] in 100..999) {
                } else {
                    println("Число должно быть от 100 до 999!")
                    break
                }

            } catch (e: NumberFormatException) {
                println("Ошибка: Введите целое число!")
                break
            }
            x++
        }
        var z = 0
        var l = 0
        var count = 0
        var tf: Boolean = true
        var arrOfNum2: Array<Int> = Array(10) { -1 }
        for (i in 0 until n * m) {
            z = arrOfNum[i]
            print("$z ")
            while (z > 0) {
                for (j in 0 until arrOfNum2.count()) {
                    if (z % 10 == arrOfNum2[j]) {
                        tf = false
                        break
                    }
                }
                if (tf) {
                    arrOfNum2[l] = z % 10
                    l++
                    count++
                }
                z /= 10
                tf = true
            }
        }
        println()
        print("В массиве использовано $count различных цифр")
    }
}