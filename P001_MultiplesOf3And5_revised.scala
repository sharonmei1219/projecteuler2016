var target = 1000 - 1

def sumDivisableBy(x:Int) = {
	var n = target/x
	x * n * (n + 1) / 2
}

println(sumDivisableBy(3) + sumDivisableBy(5) - sumDivisableBy(15))
