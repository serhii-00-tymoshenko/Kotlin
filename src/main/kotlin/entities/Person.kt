package entities

import interfaces.Displayable

class Person(name: String, age: Int, isFemale: Boolean) : Displayable {
    private val name: String = name
        get() = "My name is $field"

    init {
        val sex: String = if (isFemale) "F" else "M"

        println("Adding user to DB...")
        println("It's first words: ")
        println("$name ($age$sex), and I was successfully added to DB.")

    }

    override fun display(): Map<String, Person> {
        val map = mapOf(name to this)
        return map
    }
}