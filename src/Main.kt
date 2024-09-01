fun main() {
    val str = "Шумоизоляция"
    var setStr = str.toSet()
    var result = str.length - setStr.size
    println("Количество повторяющихся символов $result")

}