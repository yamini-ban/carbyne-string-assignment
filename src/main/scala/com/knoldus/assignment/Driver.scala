package com.knoldus.assignment

object Driver extends App {
  val str = "Knol is a unit of Knowledge & Dus comes from Druksh which is Sanskrit for a tree," +
    " hence Knoldus is a tree of Knowledge."
  val str1 = "1 hi I'm yamini 2 1."
  val strOps = new StringOperations(str1)
  println(strOps.countAlphabetOccurrances())


}
