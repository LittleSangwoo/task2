fun main() {
    val uniqNum = (1..33).shuffled()
    val alphabet = listOf('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я')
    val alphMap = mutableMapOf<Int, Char>()
    for (i in 0..32) {
        print(uniqNum[i])
        print(" ")
        alphMap[uniqNum[i]] = alphabet[i]

    }
    println()
    println(alphMap)
    print("Введите кодовое слово: ")
    var kod = readln()
    for (i in 0 until kod.count()) {
        print(kod[i])
        println()
    }
    print("Введите исходный текст: ")
    var orig = readln()
    var result = ""
    var z = 0
    var k = mutableMapOf<Int, Char>()
    val reverseMap = alphMap.entries.associate { (key, value) -> value to key }
    var count = 0
    for (i in 0 until orig.length) {
        if(i >= kod.length) { count = 0}
        val num1 = reverseMap[kod[count]] ?: 0
        val num2 = reverseMap[orig[i]] ?: 0
        val sum = num1 + num2
        if (sum > 33) {
            z = num2 - (33 - num1)
            result += alphMap[z]
        }
        else {
            z = num1 + num2
            result += alphMap[z]
        }
        count++
    }
    print(result)
}