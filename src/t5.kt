fun main() {
    print("Введите количество слов: ")
    val n = readln().toInt()

    val words = Array(n) { "" }
    for (i in 0 until n) {
        print("Введите слово №${i + 1}: ")
        words[i] = readln().trim()
    }

    // Карта: отсортированные буквы -> список слов
    val groups = mutableMapOf<String, MutableList<String>>()

    for (w in words) {
        // ключ — буквы слова в отсортированном виде, например "eat" -> "aet"
        val key = w.toCharArray().sorted().joinToString("")
        if (key !in groups) {
            groups[key] = mutableListOf()
        }
        groups[key]!!.add(w)
    }

    println("\nГруппы слов с одинаковыми буквами:")
    for ((_, list) in groups) {
        println(list.joinToString(", "))
    }
}
