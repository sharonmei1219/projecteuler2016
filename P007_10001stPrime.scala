var pr: Stream[Int] = 2 #::Stream.from(3).filter(n => !pr.takeWhile(_ <= Math.sqrt(n).toInt).exists(n%_ == 0))
println(pr(10000))