package com.rockthejvm.playground.part1basics

object Expressions {

  //structures that evaluate to a value
  val meaningOfLife = 40 + 2
  //evaluates to the value 42

  //expressions that compose + - * /, bitwise | & >> <<
  val mathExpression = 1 + 3 * 4 //13
  //evaluates in order of precedence

  //boolean expressions
  val equalityTest = 1 == 2 //expression returns true or false, like comparison operators

  //if expression
  val anIfExpression = if (equalityTest) 45 else 99
  val anIfExpression_v2 = if equalityTest then 45 else 99

  //code blocks are also expressions
  val aCodeBlock = {
    //inside I can define local values
    val localValue = 78
    //a bunch of expressions


    //last value = is the value of the entire block
    localValue + 99
  }

  //everything in Scala is an expression
  //indentation syntax
  val aCodeBlock_v2 =
  //new indentation is a new block
    //inside I can define local values
    val localValue = 78
    //a bunch of expressions


    //last value = is the value of the entire block
    localValue + 99
  //deindentation = end of block //safer to stick to the curly braces, make it explicit what belongs to which code

  //pattern matching - 'switch on steroids"
  val someValue = 42
  val description = someValue match {
    case 1 => "the first"
    case 2 => "second"
    case 42 => "the meaning of life"
    case _ => "something else"
  }


  def main(args: Array[String]): Unit = {
    println(mathExpression)
    println(equalityTest)
    println(anIfExpression)
    println(if (equalityTest) 45 else 99)
    println(aCodeBlock)
    println(aCodeBlock_v2)
    println(description)
  }
}
