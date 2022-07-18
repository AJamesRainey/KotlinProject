class Fruit {
    val fruitList = mutableSetOf<String>()

    // function to add fruit to list
fun addFruit(addition: String) {
        //if size of fruitlist > 10, do not add to list
    if (fruitList.size >= 10) {
        println("You have too many fruits already!")

    }
    else {
        fruitList.add(addition)
        println("$addition was added to the fruit list!")
    }
    }


    fun listFruit() { //list all fruits in fruitList
        for(items in fruitList){
            println(items)
        }
    }

    fun deleteFruit(deletion: String) { // delete fruit based on user input
        if (deletion == "all") {
        }
        else if (fruitList.contains(deletion)){
            fruitList.removeAll(listOf(deletion).toSet())
        }
        else {
            println("No such fruit!")




        }
    }
}