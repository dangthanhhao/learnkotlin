import kotlin.properties.Delegates

class User(name:String){
    var address:String by Delegates.observable("default value"){
        prop,old,new->
        println("Properties $prop changes from $old to $new")

    }
}


fun main() {
    val a=User("dang thanh hao")
    a.address="Changed"

    val x= arrayOf(1,2,3)
    x.forEach({x-> println("$x")})
    x.forEach { x-> println("$x") }
}