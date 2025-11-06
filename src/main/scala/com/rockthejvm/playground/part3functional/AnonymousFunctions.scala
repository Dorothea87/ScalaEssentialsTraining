package com.rockthejvm.playground.part3functional

object AnonymousFunctions {
  //apply
  //FunctionN
  val doubler: Function1[Int, Int] = new Function[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }

  //function types
  val doubler_v2: Int => Int = (n: Int) => n * 2 //lambda, equivalent to the above

  //more function types
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  //zero arg functions Function0[A]
  val justDoSomething: Function0[Int] = new Function0[Int] {
    override def apply(): Int = 42
  }

  val justDoSomething_v2: () => Int = () => 42

  //alt syntax with curly braces
  val stringToInt = { (string: String) =>
    //block of code
    val stringLength = string.length
    stringLength + 45
  }

  //type inference
  val doubler_v3: Int => Int = n => n * 2 // type of arg is inferred
  val adder_v2: (Int, Int) => Int = (a, b) => a + b

  //shorter notation possible, underscore notation
  val doubler_v4: Int => Int = _ * 2 //same function instance
  val adder_v3: (Int, Int) => Int = _ + _ //params are defined by position, each _ is a dif arg



  def main(args: Array[String]): Unit = {
    println(doubler(4))
    println(doubler_v2(4))
  }
}
