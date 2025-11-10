package com.rockthejvm.playground.part3functional

object Lists {

  //singly linked list
  val aList: List[Int] = List.apply(1, 2, 3)
  //first element(head), rest of the list (tail)
  val firstElement: Int = aList.head
  val rest = aList.tail
  //add (prepend) an element to the list
  val biggerList = 0 :: aList //always returns a new list: 0, 1, 2, 3
  //add (append) an element at the end of the list
  val evenBiggerList = aList :+ 4 //1, 2, 3, 4

  //utility methods
  val scalax5 = List.fill(5)("Scala")

  def add2numbers(x: Int)(y: Int): Int = x + y

  //revers a list
  val reversedList = aList.reverse //new list [3, 2, 1]
  //concatenate with another List
  val concatenation = aList ++ List(4, 5, 6)

  //format the collection
  val stringRep = aList.mkString("|") //"1|2|3"
  val stringRep2 = aList.mkString("[", ",", "]") //"[1,2,3]"

  //combine all elements in a list
  val total = aList.reduce((a, b) => a + b) //[1,2,3] => 1 + 2 = 3 => 3 + 3 = 6
  val total2 = aList.reduce(_ + _)

  //map - transforms a list by applying a function on every element of that list
  val tenxList = aList.map(x => x*10) // new List 10, 20, 30

  // in OOP: (algorythm)
  //val array = [1, 2, 3}
  //val result = array[3]
  //for (int i = 0; i < array.size; i ++)
  //  result[i] = array[i] * 3
  //return result

  val scalaList = aList.map(x => s"Scala $x")

  //filter - transform a list by just keeping the items satisfying a boolean function
  val evenNumbers = aList.filter(x => x % 2 == 0) //keep the items that satisfy this function, is a new list old one stays intact

  //HOF = take other functions as arguments or return functions as results

  //flatMap - transform a list by applying the function to every element
  val expandedList = aList.flatMap(x => List(x, x + 1)) //flattens, concatenates all the elements into a giant list

  def main(args: Array[String]): Unit = {
    println(aList)
    println(biggerList)
    println(evenBiggerList)
    println(scalax5)
    println(stringRep)
    println(stringRep2)
    println(total)
    println(tenxList)
    println(scalaList)
    println(evenNumbers)
    println(expandedList)
  }
}
