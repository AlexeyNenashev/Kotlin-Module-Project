import java.util.Scanner

abstract class NotebookCollection<T : NotebookItem> {
    val list = mutableListOf<T>()
    abstract val nameOfElement: String

    fun start() {
        while (true) {
            var i: Int = 1
            println("List of ${nameOfElement}s:")
            println("0. Create $nameOfElement")
            for (x in list) {
                println("$i. ${x.name}")
                i++
            }
            println("$i. Exit")
            println("Select $nameOfElement:")
            try {
                val input: Int = Scanner(System.`in`).nextLine().toInt()
                when (input) {
                    0 -> createElement()
                    in 1..(i - 1) -> list.elementAt(input - 1).goTo()
                    i -> break
                    else -> println("You entered wrong number.")
                }
            } catch (e: NumberFormatException) {
                println("This is not a number.")
            }
        }
    }

    private fun createElement() {
        while (true) {
            println("Enter name of new $nameOfElement:")
            val inputName: String = Scanner(System.`in`).nextLine()
            if (inputName.isNotEmpty()) {
                addNewElementToList(inputName)
                println("$nameOfElement '$inputName' created.")
                break
            }
            println("Name shouldn't be empty.")
        }
    }

    abstract fun addNewElementToList(name: String)

}