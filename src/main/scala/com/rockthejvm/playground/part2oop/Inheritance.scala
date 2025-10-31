package com.rockthejvm.playground.part2oop

object Inheritance {

  class VideoGame {
    val gameType = "interactive"
    def play(): Unit = println("game running!")

  }


  //singe class inheritance
  class Shooter extends VideoGame {
  //can define my own fields and methods
    def multiplayer = {
      play()
      println("boom, boom!")
    }
  }

  val crysis = new Shooter

  //inherit the primary constructor = class definition not just class itself but also constructor
  class Person(val name: String, age: Int)
  class Adult(name: String, age: Int) extends Person(name, age) //must specify constructor arguments

  val daniel = new Adult("Daniel", 99)

  def main(args: Array[String]): Unit = {
    println(crysis.gameType)
    println(crysis.multiplayer)
    println(daniel.name)

  }
}
