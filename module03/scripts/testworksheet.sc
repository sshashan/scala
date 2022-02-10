class Rational private (val n:Int,val d:Int){
  require(d!=0,"Denominator is Zero")
  override def toString: String = s"R($n/$d)"
//  Auxiliarry cons def this(i:Int) =this(i,1)
  def min(other:Rational):Rational = {
    //println(this)
    println(other)
    if((n.toDouble/d ) <  (other.n.toDouble/other.d)) this else other
  }
}

object Rational{
   def  apply(n: Int): Rational = new Rational(n, 1)
  def apply(n:Int,d:Int):Rational = new Rational(n,d)

}


val half = Rational(1,2)
val oneFourth =  Rational(1,4)

val one= Rational(1)

one.min(half)
//val onethree = new Rational(1,3)
//half.min(onethree)




