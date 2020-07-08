enum class Direction{
    NORTH,
    WEST,
    EAST,
    SOUTH
}
enum class Color(val r:Int, val g:Int, val b:Int){
    BLACK(256,256,256),
    WHITE(0,0,0)
}
enum class ToogleOnOFF(val arg:Int){
    ON(2) {
        override fun reverseAction()=OFF

    },
    OFF(1) {
        override fun reverseAction()=ON
    };
    abstract fun reverseAction():ToogleOnOFF
}
fun main() {
    val a:ToogleOnOFF=ToogleOnOFF.OFF
    println(a.reverseAction())
}