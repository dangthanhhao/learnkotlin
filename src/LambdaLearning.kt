//fun aFunction(): Int {
//    return 123
//}
//----lambda
//val aFunction={x:Int->x+1}
val aFunction:(Int)->Int= {x->x+1}

//anonymus without return
//val aFunction = fun(arg: Int) {
//    println(arg)
//}

fun main() {
//println(aFunction(2))
    aFunction(2)
}