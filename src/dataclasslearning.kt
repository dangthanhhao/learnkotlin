data class Person(val name:String,val age:Int){

}

fun main() {
    val p1=Person("hao",21)
    val p2=p1.copy()
    println(p2.hashCode())

    println(p2.equals(p1).toString()+"\n"+p2.toString())


}