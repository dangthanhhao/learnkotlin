fun main() {
    //  swith-case
    fun aFunction(arg: String) = when (1) {
        1 -> {
            println("str1 $arg");
        }
        2, 3 -> {
            println("str2 $arg");
        }
        in 4..10 -> {
            println("str3..10 $arg")
        }
        else -> {
            println("str3 $arg")
        }
    }
//    aFunction("s")

//    for-loop
    val arrayNumbers: Array<Int> = arrayOf(11, 22, 33)

    for (element in arrayNumbers)
        println(element)

    for (index in arrayNumbers.indices)
        println("A value at index $index is ${arrayNumbers[index]}")

    for ((index,value) in arrayNumbers.withIndex()){
        println("A value at $index is $value")
    }
    arrayNumbers.forEach { i->println(i) }
    arrayNumbers.forEach(fun (i) {println(i)})

}