package com.rockthejvm.playground.part1basics

object ValuesAndTypes {

  val meaningOfLife: Int = 42
  //const int meaningOfLife = 42;
  //values cannot be reassigned

  //type inference, compiler infers a type
  val anInteger = 67 + 34

  //common types
  val aBoolean: Boolean = true //or false
  val aChar: Char = 'a' //always in single quotes
  val anInt: Int = 45 //4 bytes
  val aShort: Short = 5243 //2 bytes
  val aFloat: Float = 2.4f //4 byte decimal
  val aDouble: Double = 3.14 //8-byte decimal
  val aLong: Long = 53672856327L // 8-byte integer

  //string type
  val aString: String = "Scala Rocks"

  def main(args: Array[String]): Unit = {

  }
}
