import scala.collection.mutable

val name="Shashank".toLowerCase().toCharArray
name
val map1= mutable.Map('a'->1).empty
for(ele <- name)
  {
    map1 += ele ->name.count(x=>x.equals(ele))
  }

map1


