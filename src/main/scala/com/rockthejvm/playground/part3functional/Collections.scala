package com.rockthejvm.playground.part3functional

object Collections {
  //Ranges - in general for numerical types
  val first10Numbers = 1.to(10) //<- 0 is end of range, describes the start and the end of the range or syntax: 1 to 10
  //repeat an action
  //convert to a collection
  val numbers10 = first10Numbers.toList

  //Arrays - native arrays (JVM stored natively on the OS)
  val anArray = Array.ofDim[Int](1000) // represented as int[]
    //mutable
  anArray.update(31, 42) //sets the value at index 31 to the value 42
  val fifthNumber = anArray.apply(4) //anArray[4]
  //used in the internal implementation of collections but not explicitly used a lo


  //Sets - collections with no duplicates (decided with the equals method)
  val aSet = Set(1, 2, 3, 4, 2, 3, 1, 5) //just contains [1, 2, 3, 4, 5]
  //main functionality: test if an item is in the set or not
  val setContains3 = aSet.contains(3) //true
  val setContains3_v2 = aSet(3) //true -> apply method
  //add or remove items from a set - return a new set (immutable)
  val aBiggerSet = aSet + 99 //[1, 2, 3, 4, 5, 99]
  val aSmalerSet = aSet - 2 //[1, 3, 4, 5}]
  //set only guarantees no duplicates, doesn't guarantee order (unlike list, which keeps order)

  //concatenation == union
  val anotherSet = Set(4, 5, 6, 7, 8, 9)
  val muchBiggerSet = aSet ++ anotherSet //same
  val muchBiggerSet_v3 = aSet | anotherSet //same

  //difference
  val diffSet = aSet.diff(anotherSet) //[1, 2, 3] removes the duplicates between aSet and anotherSet
  val diffSet_v2 = aSet -- anotherSet //same

  //intersection
  val intersection = aSet.intersect(anotherSet) //[4, 5]
  val intersection_v2 = aSet & anotherSet // same

  //all of them have map, flatMap and filter => for comprehension
  val combinations = for {
     x <- Set(1, 2, 3, 4, 5, 6)
     y <- Set(1, 2, 3, 4, 5, 6)
  } yield x * y

  //combinations = {x * y | x in {1, 2, 3, 4, 5, 6}, y in {1, 2, 3, 4, 5, 6}}

  def main(args: Array[String]): Unit = {
    (1 to 10).foreach(_ => println("Scala"))
    println(fifthNumber)
    println(combinations) //no order, but every product only occurs once

  }
}
