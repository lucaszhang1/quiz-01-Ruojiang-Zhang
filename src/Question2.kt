fun toDouble(rationalNumber: RationalNumber): Double{
    return rationalNumber.numerator.toDouble()/rationalNumber.denominator.toDouble()
}

fun add(rationalNumber1: RationalNumber, rationalNumber2: RationalNumber): RationalNumber {
    val a = rationalNumber1.numerator*rationalNumber2.denominator
    val b = rationalNumber2.numerator*rationalNumber1.denominator
    val c = a + b
    val d = rationalNumber1.denominator*rationalNumber2.denominator
    val e = RationalNumber(c,d)
    return e
}