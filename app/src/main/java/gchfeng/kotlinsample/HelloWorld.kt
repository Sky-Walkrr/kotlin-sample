import java.util.concurrent.locks.Lock

/**
 * Created by gchfeng on 2017/5/24.
 */
fun main(args: Array<String>) {
    println("Hello world!")
    var x= 0L
    val y = 1
    var s = ""
    var ss: String? = null
    ss.isEmpty()

    val person = Person("A", 12)

    println("My name is ${person.name}")

//    {x: Int, y: Int -> println(x + y)}(1, 2)
//    fun plus(x: Int, y:Int) = println(x + y)
//    plus(1, 2)

//    println(hasNull("null"))
//    println(s.isEmpty())
//    var list = arrayListOf(1, 2, 3)
//    println(list.map { value -> value * 2 })
}

fun range(s: String = "d") {
    var texts = listOf("a", "b", "c")
    if (s in texts)
        println("Yes")
    else
        println("No")

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 10.downTo(1)) {
        println(i)
    }
}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("number one")
        String -> println("string type")
        Int -> println("int type")
        else -> println("no match")
    }
}

fun getLargerNum(x: Int, y: Int): Int {
//    if (x > y)
//        return x
//    else
//        return y
    return if (x > y) x else y
}

fun getStringLength(s: Any?): Int? {
    if (s is String)
        println(s.length)

    if (s is Int)
        println(s.toString())

    if (s !is String)
        println("not a string")
    return null
}

fun hasEmpty(vararg array: String?): Boolean {
    array.forEach { s -> if (s == null || "" == s) return true }
//    for (s in array) {
//        if (s == null || "".equals(s))
//            return true
//    }
    return false
}

fun hasNull(vararg array: String?): Boolean {
    array.forEach { s -> s ?: return true }
    return false
}

fun dataClass() {
    val person = Person(age = 66)
    println(person.name)
    println(person.age)
    println(person.toString())
    val newPerson = person.copy(name = "Jack")
    newPerson.age = 6
    println(newPerson.toString())
    val name = person.name

    println("we made a new person with name $name")
    println("My name is ${newPerson.name}, i am ${newPerson.age} years old")
}


//fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
//    val result = arrayListOf<R>()
//    for (item in this)
//        result.add(transform(item))
//    return result
//}

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}
