fun main() {
    println("Welcome to the Git Practice Task Tracker!")
    val tasks = mutableListOf<String>()

    tasks.addAll(0, listOf("Add unit tests", "Add"))
    tasks.add(1, "Add more features")
    tasks.add(2, "Optimize performance")
    tasks.add(3, "Fix bugs")


    println("Current Tasks:")
    if (tasks.isEmpty()) {
        println("- No tasks yet!")
    } else {
        tasks.forEach { println("- $it") }
    }
}