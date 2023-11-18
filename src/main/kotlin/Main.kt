import entities.Person
import utils.calculator.calculateSum

fun main(args: Array<String>) {
    calculations()
    println()

    workWithList()
    println()

    workWithPersons()
}

fun workWithPersons() {
    val person = Person(name = "Susan", age = 18, isFemale = true)
    println(person.display())
}

private fun calculations() {
    println(calculateSum(1, 1));
    println(calculateSum(1L, 1L));
    println(calculateSum(1f, 1f));
    println(calculateSum(.1, .1));
}

private fun workWithList() {
    val list = mutableListOf<Int>(6, 6)
    println(list)
    list.add(6)
    println(list)
}