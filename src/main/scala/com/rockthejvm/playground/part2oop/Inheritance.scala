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

  //overriding = provide a new implementation for methods in derived classes
  class RPG extends VideoGame {
    override val gameType: String = "Roleplay"

    override def play(): Unit = println("level up!")
  }

  //subtype polymorphism
  val wow: VideoGame = new RPG //declare value of a parent type and provide an instance of a derived type

  //anonymous classes
  val psychonauts = new VideoGame {
    override val gameType = "platformer" // more complex sequence of declarations
  }
   /*
   class AnonClass$32784 extends VideoGame {
      override val gameType = "platformer"
    }
    val psychonauts: VideoGame = new AnonClass$32784 //not any knows name for us but in the memory and done on the spot
    */

  def main(args: Array[String]): Unit = {
    println(crysis.gameType)
    println(crysis.multiplayer)
    println(daniel.name)
    println(wow.gameType)
    println(wow.play())

  }
}
