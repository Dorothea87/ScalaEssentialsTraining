package com.rockthejvm.playground.part2oop

object Generics {

  //1 -> 2 -> 3 -> 4 -> 5 (link list)
  abstract class IntList {
    def first: Int

    def rest: IntList
  }

  class EmptyIntList extends IntList {
    def first: Int = throw new NoSuchElementException

    def rest: IntList = throw new NoSuchElementException
  }

  case class NonEmptyIntList(a: Int, r: IntList) extends IntList {
    def first: Int = a

    def rest: IntList = r
  }

  //reuse this logic on Strings
  //1 - copy everything - impossible
  //2 - remove the type safety, use Any - not very descriptive, defeats the purpose, no type information at compile time

  //type parameters = generics
  abstract class MyGeneralList[A] {
    def first: A

    def rest: MyGeneralList[A]

    def isEmpty: Boolean
  }

  class EmptyList[A] extends MyGeneralList[A] {
    def first: A = throw new NoSuchElementException

    def rest: MyGeneralList[A] = throw new NoSuchElementException

    override def isEmpty: Boolean = true
  }

  case class NonEmptyList[A](a: A, r: MyGeneralList[A]) extends MyGeneralList[A] {
    def first: A = a

    def rest: MyGeneralList[A] = r

    override def isEmpty: Boolean = false
  }

  //can add type arguments/generics to traits, abstract classes, case classes and normal classes BUT NOT to objects
  //can add mutliple type arguments to classes, traits, ...

  trait MyMap[K, V]

  //can add type arguments for methods
  def second[A](list: MyGeneralList[A]): A = {
    if (list.isEmpty) throw new NoSuchElementException
    else if (list.rest.isEmpty) throw new NoSuchElementException
    else list.rest.first
  }


  def main(args: Array[String]): Unit = {
    val numbers = NonEmptyList(1, NonEmptyList(2, NonEmptyList(3, new EmptyList)))
    val strings = NonEmptyList("Scala", NonEmptyList("baffles", NonEmptyList("my mind", new EmptyList)))
    val firstNumber = numbers.first
    val firstString = strings.first
    println(firstNumber)
    println(firstString)
    println(NonEmptyIntList(1, NonEmptyIntList(2, NonEmptyIntList(3, new EmptyIntList()))))
    println(second(numbers))
    println(second(strings))


  }
}
