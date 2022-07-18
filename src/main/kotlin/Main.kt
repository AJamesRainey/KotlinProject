fun main() {
    // Print Hello World
    println("Hello World!")
    val f1 = Fruit()
    f1.addFruit("Komquat")
    f1.deleteFruit(("Komquat"))
    f1.listFruit()

    fun javaFacts() {
        println("Unlike Java, Kotlin does not require the use of checked exceptions using try and catch.")
        println("Kotlin, unlike Java, does not always require the declaration of datatype for newly created variables. " +
                "Based on the data being assigned, Kotlin may be able to automatically determine whether a variable is " +
                "a string or an int for example.  ")
    }

    fun listsVSArrays() {
        println("In this exploration of Kotlin, I realized I didn't understand the difference between lists and arrays well." +
                "Since I already created a mutable list that is used to store fruit, I will now use an array. ")
    }

    fun createArray() {
        val fruitWarehouse = arrayOf<Fruit>()


    }
    fun filtering() {
        println("Predicates are used to filter data")
    }
}