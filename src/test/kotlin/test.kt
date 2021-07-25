
fun main() {

    // random function test
    val rand = listOf(1,2,4,5)
    val a = rand.filter { it > it }.sum()
    println(a)
}