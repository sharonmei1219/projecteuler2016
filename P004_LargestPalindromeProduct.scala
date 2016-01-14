def reverseNum(input: Int) = {
	def loop(reversedNum: Int, restNum: Int):Int =
		if(restNum == 0) reversedNum
		else loop(reversedNum * 10 + restNum%10, restNum/10)
	loop(0, input)
}

def isPalindrome(x:Int) = x == reverseNum(x)
def max[T <% Ordered[T]](s: Seq[T]) = util.Try(s.max).toOption

var largestPalindrome = 100001
for (i <- Range(999, 100, -1)){
	var l = max(Range(i, math.max(100, largestPalindrome/i), -1).map(_*i).filter(isPalindrome(_))).getOrElse(0)
	largestPalindrome = if(l > largestPalindrome) l else largestPalindrome
}

println(largestPalindrome)
