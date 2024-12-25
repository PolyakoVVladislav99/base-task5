fun main() {
    println("Введите число n и основание степени x через пробел:")
    val input = readLine()

    if (input.isNullOrEmpty()) {
        println("Некорректный ввод. Попробуйте снова.")
        return
    }

    val parts = input.split(" ")
    if (parts.size != 2) {
        println("Ошибка: введите данные в формате n x.")
        return
    }

    val n = parts[0].toIntOrNull()
    val x = parts[1].toIntOrNull()

    if (n == null || x == null || n <= 0 || x <= 1) {
        println("Ошибка: некорректные значения. Убедитесь, что n > 0 и x > 1.")
        return
    }

    var y = 0
    var value = 1

    while (value < n) {
        value *= x
        y++
    }

    if (value == n) {
        println("Целочисленный показатель степени: y = $y")
    } else {
        println("Целочисленный показатель не существует.")
    }
}
