package interfaces

import entities.Person

interface Displayable {
    fun display(): Map<String, Person>
}