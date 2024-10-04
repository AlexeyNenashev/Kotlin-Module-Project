class Archive (override val name: String) : NotebookCollection<Note>(), NotebookItem {
    override val nameOfElement: String = "note"

    override fun goTo() {
        println("Go to archive $name")
        start()
    }

    override fun addNewElementToList(name: String) {
        val newNote = Note(name)
        newNote.readNoteText()
        list.add(newNote)
    }
}