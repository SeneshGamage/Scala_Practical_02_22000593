object App {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3f
    val g = ??? // You need to provide a value for 'g'

    // Expression 1
    val result1 = -(-b) * a + c * d
    println(s"Expression 1 result: $result1") // Output: 26

    // Expression 2
    println(s"Initial value of 'a': $a")
    a += 1
    println(s"After increment: $a")

    // // Expression 3
    // val result3 = -2 * (g - k) + c
    // println(s"Expression 3 result: $result3") // Output: -1.4

    // Expression 4
    println(s"Initial value of 'c': $c")
    c += 1
    println(s"After increment: $c")

    // Expression 5
    c += 1
    a += 1
    val result5 = c * a
    println(s"Expression 5 result: $result5")
  }
}
