/**
 * Created by gchfeng on 2017/5/26.
 */
//object Utils {
//    @JvmStatic
//    fun String?.isEmpty(): Boolean {
//        return this == null || "" == this
//    }
//}

fun String?.isEmpty(): Boolean {
    return this == null || "" == this
}


fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
    var result = arrayListOf<R>()
    this.forEach {i -> result.add(transform(i))}
//    for (i in this)
//        result.add(transform(i))
    return result
}