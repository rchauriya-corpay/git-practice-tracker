fun main() {
    println("Welcome to the Git Practice Task Tracker!")
    val tasks = mutableListOf<String>()

    tasks.add("Complete the code completion task")
    tasks.add("Fix the code formatting issues")

    println("Current Tasks:")
    if (tasks.isEmpty()) {
        println("- No tasks yet!")
    } else {
        tasks.forEach { println("- $it") }
    }
}