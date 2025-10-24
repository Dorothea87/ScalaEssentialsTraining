package com.rockthejvm.playground.part1basics

object Functions {

  //function is a mini-program/reusable piece of code that you can parameterise
  def aFunction(a: String, b: Int): String = {
    //always a single instruction
    a + " " + b
  }

  //invoke a function
  val anInvocation = aFunction("scala", 999)

  //functions returning Unit
  //Unit == "void" in other languages like Java, C, C++
  def aVoidFunction(aString: String): Unit =
    println(aString)

  //you can do a lot inside the implementation of a function, especially if you use a code block {}
  def functionWithSideEffects(aString: String): String = {
    println(aString) //a side effect, void returns unit
    aString + " " + aString //this returns a type, last expression gets returned
  }

  //can define smaller functions inside a bigger one
  def aBigFunction(n: Int): Int = {
    //can define smaller function
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    //can call smaller functions only inside the code block, only accessible locally
    aSmallerFunction(n, n + 1)
  }

  def main(args: Array[String]): Unit = {
    println(anInvocation)
  }
}
