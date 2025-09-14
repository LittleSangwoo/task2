fun main() {
    print("Введите количество элементов в 1 массиве: ")
    var n: Int = readln().toInt()
    print("Введите количество элементов во 2 массиве: ")
    var m: Int = readln().toInt()
    var arr1: Array<Int> = Array(n) { 0 }
    var arr2: Array<Int> = Array(m) { 0 }

    for (i in 0 until arr1.size){
        print("Введите число для 1 массива: ")
        arr1[i] = readln().toInt()
        println()
    }
    for (i in 0 until arr2.size){
        print("Введите число для 2 массива: ")
        arr2[i] = readln().toInt()
        println()
    }
    val arr3 = Array(minOf(n, m)) { -1 }
    var c3 = 0 // индекс для заполнения arr3

    // проходим по первому массиву
    for (i in 0 until arr1.size) {
        var count1 = 0
        var count2 = 0

        // считаем сколько раз arr1[i] встречается в arr1 до позиции i,
        // чтобы не обрабатывать одинаковое число несколько раз
        for (k in 0 until i) {
            if (arr1[k] == arr1[i]) count1++
        }
        // если уже встречали — пропускаем
        if (count1 > 0) continue

        // сколько раз это число встречается в arr1
        var freq1 = 0
        for (x in arr1) if (x == arr1[i]) freq1++

        // сколько раз это число встречается в arr2
        var freq2 = 0
        for (x in arr2) if (x == arr1[i]) freq2++

        val times = minOf(freq1, freq2)
        for (t in 0 until times) {
            arr3[c3] = arr1[i]
            c3++
        }
    }
    var arr4 = arr3.sorted()
    for (l in arr4) {
        if (l == -1) {
            continue
        }
        print(l)
    }

}