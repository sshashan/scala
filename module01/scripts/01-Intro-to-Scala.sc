import scala.collection.mutable

val name="deepak"
val trans = name.toCharArray
  .filter(x=>x.equals('a')||
    x.equals('e')
    ||x.equals('o')
    ||x.equals('u'))


trans
val vowelList=Array('a','e','i','o','u')
val map1=mutable.Map('a'->0).empty
for(ele <- vowelList) {
  trans.filter(x => x.equals(ele))
  map1 += ele ->trans.count(x => x.equals(ele))
}
println(map1)