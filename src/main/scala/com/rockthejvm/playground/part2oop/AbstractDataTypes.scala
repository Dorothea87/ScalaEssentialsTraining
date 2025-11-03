package com.rockthejvm.playground.part2oop

object AbstractDataTypes {
  //abstract classes

  abstract class VideoGame {
    //fields or methods without impl = abstract
    val gameType: String
    def play(): Unit

    //can provide "normal" fields or methods
    def runningPlatform: String = "PS5"
  }
  //cannot be instantiated on their own
  //val videoGame: VideoGame = new VideoGame -> cannot instantiate VideoGame on its own
  //derived classes much be either abstract or non-abstract with an implementation for the fields that are not defined(e.g. gameType)
  class Shooter extends VideoGame {
    override val gameType: String = "FPS"

    override def play(): Unit = println("fire!")
  }


  //Traits(not all fields implemented) abstract data type
  //can be inherited in  a different way
  trait ThirdPerson {
    def showPerspective(game: VideoGame): Unit
  }

  //traits can extend other traits
  trait OpenWorld extends ThirdPerson {
    override def showPerspective(game: VideoGame): Unit = println("I see myself from the back and also see an open world.")
  }

  //abstract classes vs traits
  // a class can only extends one class but multiple traits

  trait StoryLine {
    def mainCharacter: String
  }

  class MassEffect extends VideoGame with OpenWorld with StoryLine {
    //gameType, play
    //mainCharacter
    override val gameType: String = "open-world-story"

    override def play(): Unit = println("saving the galaxy")

    override def mainCharacter: String = "Commander Shepard"
  }

  def main(args: Array[String]): Unit = {
    val counterStrike = new Shooter
    println(counterStrike.runningPlatform)

  }
}
