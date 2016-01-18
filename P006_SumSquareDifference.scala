def sqr(x: Int) = x * x
println(sqr((1 to 100).sum) - (1 to 100).map(sqr).sum)