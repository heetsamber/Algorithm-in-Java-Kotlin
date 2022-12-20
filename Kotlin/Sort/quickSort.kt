fun <T:Comparable<T>>quicksort(items:List<T>):List<T>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]
    val equal = items.filter { it == pivot }
    val less = items.filter { it < pivot }
    val greater = items.filter { it > pivot }
    return quicksort(less) + equal + quicksort(greater)
}

fun main(args: Array<String>) {

    println("\n 정렬전:")
    val names = listOf<String>("Tom", "Jerry", "Mikey", "pica", "Merry", "Harry", "Apple")
    println(names)
    println("\n 정렬후:")
    val ordered =  quicksort(names)
    println(ordered)
}
