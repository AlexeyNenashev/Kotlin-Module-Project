class Notebook : NotebookCollection<Archive>() {
    override val nameOfElement: String = "archive"

    override fun addNewElementToList(name: String) {
        list.add(Archive(name))
    }

}