import java.util.HashMap

fun main(args: Array<String>) {
    val three = "dorm"
    val four = "mordor"
    //LOTR reference
    println(areAnagrams(three, four))

    val five = "tom marvolo riddle"
    val six = "iam lord voldemort"
    //the famous Harry Potter reference
    println(areAnagrams(five, six))
}

private fun areAnagrams(one: String, two: String): Boolean {
    val map = HashMap<Char, Int>()

    for (c in one.toCharArray())
        if (map.containsKey(c))
            map[c] = map[c]!! + 1
        else
            map[c] = 1

    for (c in two.toCharArray())
        if (!map.containsKey(c))
            return false
        else {
            map[c] = map[c]!! - 1

            if (map[c] == 0)
                map.remove(c)
        }
    return map.isEmpty()
}
