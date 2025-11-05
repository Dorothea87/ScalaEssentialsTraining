package com.rockthejvm.playground.part2oop

object CaseClasses {
  //lightweight data structure
  case class Pet(val name: String, val age: Int) {
    //define fields and methods
  }

  //1 - class constructor arguments are automatically promoted to fields
  val dino = new Pet("Dino", 2)
  val dinoAge = dino.age

  //2 - case classes can be built without the new keyword
  val pumba = Pet("Pumba", 13) //new is not required
  val dino_v2 = new Pet("Dino", 2)

  //3 - toString, equals, hashCode (Any type, extended by default)
  class PetSimple(name: String, age: Int)
  val dinoSimple = new PetSimple("Dino", 2)
  val dinoSimple_v2 = new PetSimple("Dino", 2)

  //4 - utility methods
  val dinoYounger = dino.copy(age = 1) //new instance of pet with the same data, EXCEPT the argumant I pass

  //5 - companion objects already created, with an apply method with the same signature as the constructor
  val dino_v3 = Pet.apply("Dino", 3)

  //6 - serialisable, instance of a class can be stored on file so I can reuse it later, have a protocol that we can turn an instance from the heap into a common format so a another JVM can read it
  //important for parallel/distributed systems e.g. in Akka or Pekko
  //7 - are eligible for pattern matching

  //case object only oinstance of its type
  case object UnitedKingdom {
    def name: String = "The United Kingdom of Great Britain and Northern Ireland"
  }
  //define hierarchies  of data structures, some are their own types

  trait Message
  case class InitialInteraction(message: String) extends Message
  //some other case classes
  case object EndConversation extends Message //token that marks end of convo between systems

  //pattern matching
  //some external message
  def getMessage(): Message =
    InitialInteraction("hello")

  val message: Message = getMessage()
  val contens = message match {
    case InitialInteraction(someContent) => s"I have received + $someContent"
    case EndConversation => "end of chat"
  }

  def main(args: Array[String]): Unit = {
    println(dinoSimple.toString)
    println(dino.toString)
    println(dino == dino_v2) //compares data not just references, hence true
    println(dinoSimple == dinoSimple_v2)
    println(dinoYounger)
  }
}
