import org.scalatest.{MustMatchers, WordSpec}

class RomanNumeralConverterSpec extends WordSpec with MustMatchers {

  "NumeralConverter" must {

    "return 1 when given 'I'" in {
      RomanNumeralConverter.NumeralConverter("I") mustEqual 1
    }


    "return 10 when given X" in {
      RomanNumeralConverter.NumeralConverter("X") mustEqual 10
    }

    "return 100 when given C" in {
      RomanNumeralConverter.NumeralConverter("C") mustEqual 100
    }

    "return 10 when given M" in {
      RomanNumeralConverter.NumeralConverter("M") mustEqual 1000
    }


  }
}
