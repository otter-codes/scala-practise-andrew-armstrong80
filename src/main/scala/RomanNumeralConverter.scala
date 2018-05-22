import scala.annotation.tailrec

object RomanNumeralConverter {

  def NumeralConverter(numeral : Char) : Int = {

    numeral match {

      case 'I' => 1
      case 'X' => 10
      case 'C' => 100
      case 'M' => 1000
      case 'V' => 5
      case 'L' => 50
      case 'D' => 500
    }
  }
    def NumeralAdder(input : String) : Int = {

      val subtract = input.toList.map(NumeralConverter).head
      val prime = input.toList.map(NumeralConverter).tail.head

      if (prime > subtract) {
        prime - subtract
      } else {
        input.map(NumeralConverter).sum
      }

    }
}
