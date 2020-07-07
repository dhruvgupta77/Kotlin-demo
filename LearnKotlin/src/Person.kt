fun main(args: Array<String>) {
    val person1 = Person("Dhruv", 21)
    println("First Name = ${person1.firstName}")
    println("Age = ${person1.age}")

    //Use of if else
    val a:Int = 5
    val b:Int = 2
    var max: Int

    if (a > b) {
        max = a
    } else {
        max = b
    }
    println("Maximum of a or b is " +max)

    //Use of when (Similar to switch statement)
    val x:Int = 5
    when (x) {
        1 -> print("x = = 1")
        2 -> print("x = = 2")

        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }

    //for loop
    val items = listOf(1, 2, 3, 4)
    for (i in items) println("values of the array"+i)


}

class Person (val firstName: String, var age: Int){
    constructor(name: String, age: Int, message: String) : this(name,age) {
    }
}