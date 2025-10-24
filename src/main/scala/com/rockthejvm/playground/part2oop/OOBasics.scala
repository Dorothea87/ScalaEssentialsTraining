package com.rockthejvm.playground.part2oop

object OOBasics {

  //classes and instances
  class Person(name: String, age: Int) { //class definition als contains the definition of its constructor
    //inside we can define val, var, def
    //fields
    val allCaps = name.toUpperCase()

    //methods = functions asociated with the class
    def greet(someone: String): String =
      s"$name says: Hi $someone"

    //can define multiple methods with the same name (overloading), if we have different signature
    def greet(): String =
      s"Hi everyone, I am $name"
  }

  val dorothea = new Person("Dorothea", 38) //instance of Person, act of creating it is instantiation


  def main(args: Array[String]): Unit = {
    println(dorothea.allCaps)
    println(dorothea.greet("Alice"))
    println(dorothea.greet())

  }
}
