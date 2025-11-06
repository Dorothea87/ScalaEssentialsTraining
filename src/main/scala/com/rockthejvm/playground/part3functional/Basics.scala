package com.rockthejvm.playground.part3functional

object Basics {

  //apply
  case class Person(name: String, faveMovie: String) {
    def apply(n: Int): String =
      s"$name watched $faveMovie $n times"
  }

  val daniel = Person("Daniel", "Interstellar")
  val danielStatement = daniel.apply(4)
  val danielStatement_v2 = daniel(4)

  //we can create function types
  trait SimpleMathFunction {
    def apply(n: Int): Int
  }

  val doubler: SimpleMathFunction = new SimpleMathFunction {
    override def apply(n: Int): Int = n * 2
  }

  val six = doubler(3)

  trait MyFunction[A, B] {
    def apply(arg: A): B
  }

  val doubler_v2 = new MyFunction[Int, Int] {
    override def apply(arg: Int) = arg * 2
  }

  val six_v2 = doubler_v2(3)

  //in functional programming we work with functions as first class elements of the language

  //we can pass functions as arguments, we can return them as results because they are a regular type
  //Int => Int can be expressed as trait that has apply(Int): Int
  //(String, Int) => String can be expressed as trait that has apply(String, Int): String

  trait MyStrIntFunction {
    def apply(s: String, i: Int): String
  }

  val myCombinator = new MyStrIntFunction {
    override def apply(s: String, i: Int): String =
      s"$s, ($i)"
  }

  //Scala already has function traits
  val doubler_v3 = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 * 2
  }

  val myCombinator_v2 = new Function2[String, Int, String] {
    override def apply(v1: String, v2: Int): String = s"$v1, ($v2)"
  }

  val superfunction = new Function4[Int, String, Double, Boolean, Int] {
    override def apply(v1: Int, v2: String, v3: Double, v4: Boolean): Int = v1 * 10
  }

  //all function values in Scala are instances of the FunctionN traits with apply methods

  def main(args: Array[String]): Unit = {
    println(danielStatement)
    println(danielStatement_v2)
    println(six)
    println(six_v2)
    println(myCombinator("ladida", 17))
    println(myCombinator_v2("ladida", 17))
    println(superfunction(4, "Scala", 3.41, true))

  }
}
