package com.rockthejvm.playground.part2oop

object Exceptions {

  class MyException extends RuntimeException("Too big of a number - overflowing Int!")

  def sumN(n: Int): Int =
    if (n < 0) throw new IllegalArgumentException("Negative numbers not supported!")
    else if (n >= 50000) throw new MyException
    else if (n == 0) 0
    else n + sumN(n - 1)


  //try-catch

  val attempt = try {
    //block of code that can crash
    println(sumN(-10))
  } catch {
    case e: IllegalArgumentException => -1
    case myException: MyException => Int.MaxValue
  }

  val attempt_v2 =
    try
      println(sumN(-10))
    catch
      case e: IllegalArgumentException => -1
      case e: RuntimeException => Int.MaxValue


  /**
   * Hierarchy
   * Throwable
   * - Error JVM related crashes (out of memory, stack overflow)
   * - Exception - user-facing crashes
   *  - RuntimeException (subtype)
   *  ^^ can define new exceptions
   * */


  def main(args: Array[String]): Unit = {
    //println(sumN(-10))
    println(attempt)
  }
}
