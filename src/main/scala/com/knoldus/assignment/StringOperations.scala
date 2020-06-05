package com.knoldus.assignment

import scala.collection.mutable

class StringOperations(val str: String) {

  def countAlphabetOccurrances(): mutable.LinkedHashMap[Char, Int] = {
    val map = mutable.LinkedHashMap.empty[Char, Int]
    str
      .toLowerCase
      .foldLeft("")((result, character) => if(character.isLetter) result + character else result)
      .map(ch => map.addOne((ch,str.filter(character => ch == character).length)))
    map
  }
}