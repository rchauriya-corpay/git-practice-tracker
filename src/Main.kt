fun main() {
    println("Welcome to the Git Practice Task Tracker!")
    val tasks = mutableListOf<String>()

    tasks.add("Complete the code completion task")
    tasks.add("Fix the code formatting issues")
    tasks.add("Implement the task tracking feature")
    tasks.addAll(0, listOf("Add unit tests", "Add code documentation"))

    println("Current Tasks:")
    if (tasks.isEmpty()) {
        println("- No tasks yet!")
    } else {
        tasks.forEach { println("- $it") }
    }
}