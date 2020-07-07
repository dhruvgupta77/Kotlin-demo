fun main(args: Array<String>) {
    //for loop
    val items1 = listOf(1, 2, 3, 4)
    for (i in items1) println("values of the array"+i)

    println("------------------------------->")

    //for loop library function to make our development work easier than ever before.
    val items2 = listOf(1, 22, 83, 4)

    for ((index, value) in items2.withIndex()) {
        println("the element at $index is $value")
    }

    println("------------------------------->")

    //while loop example
    var x:Int = 0
    println("Example of While Loop--")

    while(x <= 10) {
        print("$x, ")
        x++
    }

    //do while loop example
    println()
    var y:Int = 0
    do {
        y = y + 10
        print("I am inside Do block---"+ y + ", ")
    } while(y <= 50)
}