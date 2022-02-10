val pf1:PartialFunction[Int,Int]={
  case x if x>0 => x * x

}
pf1.isDefinedAt(-3)
val nums = (-5 to 5).toList
nums.map(pf1)