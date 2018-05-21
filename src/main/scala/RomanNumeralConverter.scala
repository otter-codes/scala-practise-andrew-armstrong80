object RomanNumeralConverter {

  def NumeralConverter(numeral : String) : Int = {

    numeral match {

      case "I" => 1
      case "X" => 10
      case "C" => 100
      case "M" => 1000
    }
  }
}
