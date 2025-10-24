package com.rockthejvm.playground.part1basics

object Recursion {

  //Scala avoids variables and loops

  //sum(3) = 1 + 2 + 3 = 6
  //sum(10) = 1 + 2 + 3 + ... + 10 = 55
  //sum(10) = 10 + sum(9)
  //sum(9) = 9 + sum(8)
  //...
  //sum(1) = 1 + sum(0)
  //sum(0) = 0

  def sum(n: Int): Int =
    if (n <= 0) 0
    else n + sum(n - 1)

  //thinking in recursion
  def printN(string: String, n: Int): Unit =
    if (n <= 0) ()
    else {
      println(string)
      printN(string, n - 1)
    }

  //more complex example
  //test all numbers 2 to n/2, test whether n % d == 0
  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)

    if (n <= 0) false //don't support negative numbers
    else if (n == 1) false //1 is not a prime number and not a composed number
    else testDivisors(2)
    //last expression is returned
  }


  //Exercises
  // - concatenate a string a set number of times
  //concatenateN("Scala", 3)
  // - Fibonacci numbers
  // 1, 2, 3, 5, 8, 13, 21, 34, ...

  def concatenateN(string: String, n: Int): String =
    if (n <= 0) ""
    else {
      string + concatenateN(string, n - 1)
    }


  def fibonacci(n: Int): Int =
    if (n <= 1) 1
    else if (n == 2) 2
    else fibonacci(n - 1) + fibonacci(n - 2)


  def main(args: Array[String]): Unit = {
    println(sum(10))
    printN("la", 6)
    println(isPrime(7))
    println(concatenateN("Boo", 3))
    println(fibonacci(6)) //13
    println(fibonacci(9))
  }
}
