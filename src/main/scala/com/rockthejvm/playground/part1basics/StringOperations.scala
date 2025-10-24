package com.rockthejvm.playground.part1basics

object StringOperations {
  //string
  val aString = "I learned to code"
  //functions attached to them
  val length = aString.length
  val startsWithI = aString.startsWith("I")
  val combine = aString + " in a year!"
  val checkEmpty = aString.isEmpty
  val findIndex = aString.indexOf("learned")
  val findIndex2 = aString.indexOf("Astronaut")

  //interpolation - inject values or expressions inside a string
  val name = "Dorothea"
  val age = "38"
  val greeting = "Hi, my name is " + name + " and I am " + age + " years old."

  val greet2 = s"Hi, my name is $name and I am $age years old." //s-interpolated string


  def main(args: Array[String]): Unit = {
    println(findIndex)
    println(findIndex2) //invalid returns -1
    println(greeting)
    println(greet2)

  }
}
