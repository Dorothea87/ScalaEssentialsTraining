package com.rockthejvm.playground.part3functional

object TuplesMaps {
  //tuples
  val aTuple: (Int, String, Int) = (2, "rock the jvm", -1)
  val firstField = aTuple._1
  val secondField = aTuple._2
  val thirdField = aTuple._3

  //tuples of 2 elements have some syntactic sugar
  val aTuple_v2 = 2 -> "rock the jvm"

  //maps: key value pairs with a unique key
  val aMap = Map()
  val phoneBook = Map(
    "Jim" -> 555,
    "Daniel" -> 921,
    "Jane" -> 123
  )

  //core methods
  //key exists in the map
  val hasDaniel = phoneBook.contains("Daniel") // true
  val danielsNumber = phoneBook("Daniel") //apply syntax -> returns 921, crash if key not in the map

  //add a new pair - returns a new map (maps are immutable)
  val newPair = "Mary" -> 678
  val newPhonebook = phoneBook + newPair // new map

  //remove a key and the associated value will be removed automatically
  val noJane = phoneBook - "Jane" //new map otherwise if key does not exist old map is returned

  //list of tuples and maps
  val listOfEntries = List(
    "Jim" -> 555,
    "Daniel" -> 921,
    "Jane" -> 123
  )

  val phonebook_v2 = listOfEntries.toMap

  //can convert a map to a list of tuples
  val listOfEntries_v2 = phoneBook.toList

  //return the set of keys
  val allNames = phoneBook.keySet //["Jim", "Daniel, "Jane]
  val allNumbers = phoneBook.values // iterable of int returned
  val allNumbers_v2 = phoneBook.values.toList // unordered [555, 921, 123]


  def main(args: Array[String]): Unit = {

  }
}
