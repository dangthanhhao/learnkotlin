class MaptoProperties (val mapObject:Map<String,Any?>){
    val keys: String by  mapObject
    val values: Any by  mapObject
}

fun main(args: Array<String>) {
    val a=MaptoProperties(mapOf("keys" to "2","values" to "4"))

    println(a.keys)
    println(a.values)

}