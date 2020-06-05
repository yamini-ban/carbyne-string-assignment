package com.knoldus.assignment

import scala.collection.mutable

class StringOperations() {

  def countAlphabetOccurrances(str: String): mutable.LinkedHashMap[Char, Int] = {
    val map = mutable.LinkedHashMap.empty[Char, Int]
    str
      .toLowerCase
      .foldLeft("")((result, character) => if(character.isLetter) result + character else result)
      .map(ch => map.addOne((ch,str.filter(character => ch == character).length)))
    map
  }

  def getStringWithOccurrances(str: String, occurrance: Int) = {
    countAlphabetOccurrances(str).foldLeft("")((result, element) => if(element._2 == occurrance) result + element._1
    else result)
  }
}