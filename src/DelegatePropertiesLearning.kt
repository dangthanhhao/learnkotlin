import kotlin.reflect.KProperty
import kotlin.reflect.jvm.javaField

class Orignal{
    var name:String by DelegatedOrignal()
}

class  DelegatedOrignal{

    operator fun getValue(orignal: Orignal, property: KProperty<*>): String {
        return "$orignal has ${property.name}"
    }
    operator fun setValue(orignal: Orignal, property: KProperty<*>,value:String){
        println("$orignal set to ${property.name} with value $value")
    }

}

fun main() {
    val a=Orignal()
    a.name="a"
}