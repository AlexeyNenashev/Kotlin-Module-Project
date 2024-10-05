class Note (override val name: String) : NotebookItem {
    var text: String = ""

    override fun goTo() {
        println("$name: $text")
    }

    fun readNoteText() {
        while (true) {
            println("Enter text of note $name:")
            text = scanner.nextLine()
            if (text.isNotBlank())
                break
            println("Text shouldn't be empty.")
        }
    }
}