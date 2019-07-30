fun main(args:Array<String>){
    val x = RationalNumber(3,7)
    val y = RationalNumber(5,14)
    var z = add(x,y)
    println("${z.toString()}")
    val m = RationalNumber(2,3)
    println("${toDouble(m)}")
}