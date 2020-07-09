fun main() {
    var x: Int=2
    try {
        var y= (x as String)

    }
    catch (e: Exception){
        println("Exception found!")
        e.printStackTrace();
    }

//    println(y)
}