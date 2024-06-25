object App {
  def main(args: Array[String]): Unit = {
    var a = 2
    var b = 3
    var c = 4
    var d = 5
    val k = 4.3f

        //expression 1
        println(-(-b) * a + c * d - (-c))

        //expression 2
        println({a += 1; a})

        //expression 3
        val g: Float = 4.0f
        println(-2 * (g - k) + c)

        //expression 4
        println ({c += 1; c});

        //expression 5
        print({c += 1 ; a+=1; c * a})

  }
}
