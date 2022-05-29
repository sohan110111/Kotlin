fun main() {
    println("Hello World")
    println("I learning kotlin")
    println("It is awesome.")
    println(3+3)
    print("It is doesn't print new line")//new line not print
    println("Ok")
    //var and val can be declare variable and value
    var name = "Anawar"
    val birthYear = 1988
    println(name + " " + birthYear)
    //    var also: String = "John".also { name = it } // var variable can be modified/changeable
    name = "John" // val can not be resigned
    println(name + " " + birthYear)

    // When I specify a type
    var person: String
    person = "John"
    println(person)
}