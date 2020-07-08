package interfaceLearning


fun main(args: Array<String>) {
    class Chicken : IsAnimal, IsBird {
        override fun say() {
            super<IsBird>.say()
            println("Chicken say")
        }

    }

    val aChicken = Chicken();
    aChicken.say();
}