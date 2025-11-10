package com.rockthejvm.playground.part3functional

object Exercises {
  //1 - take a list of numbers, return a list of "scala" repeated that many times
  //example [1, 2, 3] -> ["scala", "scalascala", "scalascalascala"]

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

  def concatenateN(string: String, n: Int): String =
    if (n <= 0) ""
    else {
      string + concatenateN(string, n - 1)
    }

  def digits(n: Int): List[Int] = {
    //123 => 3, 2, 1
    def getDigits(number: Int): List[Int] =
      if (number <= 0) List()
      else {
        val lastDigit = number % 10
        val quotient = number / 10
        lastDigit :: getDigits(quotient)
      }

    if (n < 0) List(0)
    else if (n == 0) List()
    else getDigits(n).reverse //[1, 2, 3]
  }

  def repeatScala(numbers: List[Int]): List[String] = {
    numbers.map(n => concatenateN("Scala", n))
  }

  //2 - Generate the first 100 numbers in a list with a recursive function

  def generateN(n: Int): List[Int] =
    if (n <= 0) List()
    else generateN(n -1) :+ n

  //3 - from the list in ex. 2, return just the prime numbers

  def primesOutOfFirstNNumbers(n: Int): List[Int] =
    generateN(n).filter(x => isPrime(x))

  //4 - take a list of numbers and return a list of all the digits of those numbers
  //example [13, 24] -> [1, 3, 2, 4]
  def listOfDigits(numbers: List[Int]): List[Int] =
    numbers.flatMap(n => digits(n))


  def main(args: Array[String]): Unit = {
  println(repeatScala(List(1,2, 5)))
    println(generateN(100))
    println(primesOutOfFirstNNumbers(100))
    println(digits(123))
    println(listOfDigits(List(12, 987)))
  }
}
