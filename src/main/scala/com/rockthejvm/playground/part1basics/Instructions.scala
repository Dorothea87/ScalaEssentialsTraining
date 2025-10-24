package com.rockthejvm.playground.part1basics

object Instructions {

  //instructions are executed vs expressions are evaluated
  //do this, do that, repeat(10) {...} -> imperative programming
  // 2+3, IO effects, map, flatMap, filter -> functional programming

  val printing: Unit = println("This is an instruction") //side effect
  //units are not evaluated to anything meaningful, but perform an instruction
  //everything in Scala is an expression
  //in Scala an instruction is a structure (expression) returning Unit

  val theUnit: Unit = () //the only possible value of type Unit

  //instructions - code blocks returning Unit
  val aCodeBlock = {
    val alocalValue = 45
    println("Instruction 1")
    println("Instruction 2")
  }

  //variables in Scala, act of reassignment is also a meaningful value/an expression producing Unit
  var aVariable = 10
  aVariable = 12
  aVariable += 12
  println(aVariable)
  val reassignment: Unit = aVariable +=1

  //loop
  var theNumber = 1
  while (theNumber <= 10) {
    println(theNumber)
    theNumber +=1
  }

  def main(args: Array[String]): Unit = {
    println(printing == theUnit)
    println(reassignment)

  }
}
