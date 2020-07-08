fun main(args: Array<String>) {
    fun addTwoNum(x:Int , y:Int) :Int{
        return x+y
    }

    fun helloWorld():Unit{
        println("hello world")
    }
    helloWorld()

    fun multiparams(vararg initParams:Int){
        for (eachParam in initParams)
            println(eachParam)
    }
    multiparams(1,2,3,4)
//    infix notation / operator
    infix fun Int.customOperator(x:Int):Int{
    return this+x
    }
    //recursive function
    tailrec fun factorial(n:Long=1):Long{
        if(n==1L)
            return 1
        else
            return n*factorial(n-1)
    }

    println(factorial(5));


}