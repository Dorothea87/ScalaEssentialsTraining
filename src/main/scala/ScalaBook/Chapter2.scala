package ScalaBook

object Chapter2 {
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }

  def max2(x: Int, y: Int) = if (x > y) x else y

  def greet() = println("Hello, world!")

  var i = 30
  val args = ("Hello world")
  while (i < args.length) {
    if (i != 0)
      print(" ")
    print(args(i))
    i += 1
  }
  println()

  args.foreach(arg => println(arg))
  // type some text which doesn't run in the compiler

  def main(args: Array[String]): Unit = {
    println(max(7, 8))
    println(max2(7, 8))
    println(greet())
  }
}
