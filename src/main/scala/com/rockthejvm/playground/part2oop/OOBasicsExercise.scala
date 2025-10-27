package com.rockthejvm.playground.part2oop

import java.io.FileReader

object OOBasicsExercise {

  //EXERCISE
  //do an app for car registration:
  // - Create a car and a driver class
  // - Car: make, model, year of release and owner = driver,
  // method owner age year of release - YOB,
  // method is owned by that takes a driver: Driver-> boolean if driver is owner
  //copy new year of release returns a new car instance with same data except the new year of release
  // - Driver: frist name, last name, YOB, method full name -> concatenate

  class Car(make: String, model: String, yearOfRelease: Int, owner: Driver) {
    def ownerAge(): Int = yearOfRelease - owner.YOB
    def isOwnedBy(driver: Driver): Boolean = driver == owner

    def copy(newYearOfRelease: Int): Car =
      new Car(make, model, newYearOfRelease, owner)

  }

  class Driver(firstName: String, lastName: String, val YOB: Int) {
    def fullName: String = {
      s"The owner of this car is: $firstName $lastName."
    }
  }

  val peter = new Driver("Peter", "Parker", 1975)

  def main(args: Array[String]): Unit = {
  println(peter.fullName)
    val driver = new Driver("Michael", "Schuhmacher", 1969)
    val driverImpostor = new Driver("Michael", "Schuhmacher", 2020)
    val car = new Car("Ferrari", "F1", 2004, driver)
    println(driver.fullName)
    println(car.ownerAge())
    println(car.isOwnedBy(driver))
    println(car.isOwnedBy(driverImpostor))
    println(car.copy(2005).ownerAge())
    println(s"testing equality: ${driver == driverImpostor}")
  }
}
