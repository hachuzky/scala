package com.mas.scala.beginning

class ScalaFirstExercise {
  
}

object FooMaker {
  def apply() = new ScalaFirstExercise
}

object Counter {
  var count = 0
  def incrementAndPrint : Long = {
    count +=1
    count
  }
}

case class Person(firstname: String, lastname:String)

//def personType(person : Person) = person match {
//  case Person ("Vitaly", "Hachuzky") => "Hello, Vitaly"
//  case Person (unknownFirstName, unknownLastName) => "Person with name: %s and lastname: %s is unknown".format(unknownFirstName, unknownLastName)
//  
//}

