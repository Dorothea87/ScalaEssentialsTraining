package com.rockthejvm.playground.part2oop

object MethodNotation {
  class Person(val name: String) {

    infix def greet(another: Person): String =
      s"$name says: Hi ${another.name}, how are you?"

    infix def likes(treat: String): String = //indication that you can call this method infix
      s"$name says: I like $treat"

    infix def ?!(another: Person): String =
      s"$name says: Hey ${another.name}, how could you do this?!"

    def apply(progLang: String): Unit =
      println(s"[$name] Programming in $progLang")

    def apply(progLang: String, algorithm: String): Unit =
      println(s"[$name] Programming in $progLang, applying the algorithm $algorithm")
  }

  val alice = Person("Alice")
  val bob = Person("Bob")

  def main(args: Array[String]): Unit = {
    println(alice.greet(bob))
    println(alice greet bob)
    //    instance method argument
    //infix notation only works on methods with one argument
    println(alice.likes("chocolate"))
    println(alice likes "chocolate")
    println(alice.?!(bob))
    println(alice ?! bob) //popular in Akka, Pekko, Cats and Zio

    alice.apply("Scala")
    alice("Scala") //both runs the same, allows us to invoke instances of classes on arguments as if they were functions
    alice("Scala", "Dynamic Programming")
  }
}
