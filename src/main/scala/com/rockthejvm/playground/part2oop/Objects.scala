package com.rockthejvm.playground.part2oop

object Objects {

  //singleton pattern
  object MySingleton {  //defined the type and the ONLY possible instance of that type (class + only possible instance of that class)
    //can define fields and methods
    val aFiled = 45
    def aMethod(x: Int) = x + 1
  }

  val theSingleton = MySingleton
  val anotherSingleton = MySingleton

  //combo of class + object of the same name in the same file = companion
  class Person(name: String) {
    def sayHi(): String = s" Hello, my name is $name"
  }

  //we store static fields and methods that do not depend on a particular instance of the class
  object Person { //obj with the same name = companion object
    //define "static" fields and methods
    val N_EYES = 2
    def canFly(): Boolean = false
  }

  //objects can extend classes/traits
  object BigFoot extends Person("BigFoot")

  /*
  Scala compiles to JVM Bytecode
  class with a static void main method that returns unit
   */

  def main(args: Array[String]): Unit = {

    println(theSingleton == anotherSingleton)
    println(MySingleton.aFiled)
    println(MySingleton.aMethod(4))
  }
}
