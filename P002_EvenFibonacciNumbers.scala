var fibs: Stream[Int] = 1 #:: 1 #:: fibs.zip(fibs.tail).map{n => n._1 + n._2}
println(fibs.takeWhile(_<4000000).filter(_%2 == 0).sum)