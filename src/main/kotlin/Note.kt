import java.util.Scanner

class Note (override val name: String) : NotebookItem {
    var text: String = ""

    override fun goTo() {
        println("$name: $text")
    }

    fun readNoteText() {
        while (true) {
            println("Enter text of note $name:")
            text = Scanner(System.`in`).nextLine()
            if (text.isNotEmpty())
                break
            println("Text shouldn't be empty.")
        }
    }
}