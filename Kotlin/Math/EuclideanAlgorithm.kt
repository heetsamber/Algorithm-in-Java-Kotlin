// Time Complexity: O(Log min(a, b))

fun gcd(a : Int, b: Int): Int{
    if (a == 0) return b;

    return gcd(b % a, a);
}
fun main(){
    val a = 1450
    val b = 450
    val result = gcd(a, b)
    println("gcd = " + result)
}
