class Rational(val n:Int,val d:Int)
{
  require(d!=0,"Zero denominator value")

  override def toString: String = s"R($n/$d)"
  def min(x: Rational) :Rational ={
    if(n.toDouble/d < x.n.toDouble/x.d)
      this
    else
      x
  }
}

val r = new Rational(1,2)
val d = new Rational(1,3)

r.min(d)