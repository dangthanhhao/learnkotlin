class A{
    companion object{
        val staticVariable="s"
        fun staticFunction():Int{
            return 0
        }
    }
    fun fun1(){
        println("A1")
    }
    fun fun2(){
        println("A2")
    }
}

class B{
    fun fun1(){
        println("B1")
    }
    fun fun2(){
        println("B2")
    }
    fun A.fun3(){ //extention class A
        println("A2 extention")
//        this.fun1() //this belong to class A
        this@B.fun1() //this belong to class B
    }
    fun callFunA3(a:A){
        a.fun3()
    }
}

fun main(args: Array<String>) {
    val b=B()
    fun B.newfunction(){
       println ("New function created in B")
    }
    b.newfunction()
}