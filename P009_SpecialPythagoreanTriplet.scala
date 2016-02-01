def pythagorean(a:Int, b:Int, c:Int):Boolean =
	a*a + b*b == c*c

def givenADeriveC(t:Int)(a:Int):Int = 
	Math.floor((t*t - 2*t*a + 2*a*a).toDouble/(2*t - 2*a)).toInt

val sum = 1000
val a = 250 to 500
val c = a.map(givenADeriveC(sum)(_))
val abc = (a zip c).map(x => (x._1, sum-x._1-x._2, x._2))

println(abc.find((pythagorean _).tupled(_)).getOrElse((0,0,0)))