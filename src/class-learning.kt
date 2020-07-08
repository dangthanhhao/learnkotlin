fun main() {
    open class Person(open val firstName: String, val lastName: String, val age: Int?) {
        private val name = "$firstName $lastName"

        //init block
        init {
            println("Object created!")
        }

        open fun talk(arg: String) {
            println("You said $arg")
        }
    }

    //inhertite
    class Student(firstName: String, lastName: String, age: Int?, val grade: Int) : Person(firstName, lastName, age) {

        override val firstName = super.firstName.toUpperCase()
        var score: Int
            get() {
                return this.score - 1
            }
            set(value) {
                score = if (value > 0) value else value
            }

        override fun talk(arg: String) {
            println("Student talk")
            super.talk(arg)
        }
        lateinit var subject:String
    }

    val person1 = Student("Dang Thanh", "Hao", null, 123)


    person1.talk("A")

}