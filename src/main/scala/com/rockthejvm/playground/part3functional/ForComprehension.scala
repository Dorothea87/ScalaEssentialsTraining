package com.rockthejvm.playground.part3functional

object ForComprehension {

  val numbers = List(1, 2, 3, 4)
  val colours = List("black", "white", "blue", "red")

  val combinations = numbers.flatMap(n => colours.map(c => s"$n ~ $c"))

  //for comprehensions
  val combinations_v2 = for {
    n <- numbers //generators
    c <- colours
  } yield s"$n ~ $c" //exactly the same as above
  //not a loop but an expression, it is identical to flat maps and maps

  //exercise - generate a checker board  from the numbers 1 to 8 and letters a to h

  val chessBoard = for {
    letter <- List('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H')
    number <- List(1, 2, 3, 4, 5, 6, 7, 8)
  } yield s"$letter$number"


  def main(args: Array[String]): Unit = {
    println(combinations)
    println(combinations_v2)
    println(chessBoard)
  }
}
