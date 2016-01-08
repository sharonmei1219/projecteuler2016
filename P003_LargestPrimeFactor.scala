//---- closure version ----


//---- simplified ---
def simpleProcedure(target: Long): Long = {
	var factor = 2
	var newTarget = target
	while(factor != newTarget){
		if(newTarget % factor == 0) newTarget = newTarget / factor
		else factor = factor + 1
	}
	factor
}

println(simpleProcedure(600851475143L))

//---- recursive ---
def recursivelyFindLargestFactor(start: Long, target: Long): Long = {
	var factor: Long = start + 1
	while (target%factor != 0) factor = factor + 1
	if (factor == target) return factor
	recursivelyFindLargestFactor(factor, target/factor)
}

println(recursivelyFindLargestFactor(2L, 600851475143L))

//---- origin ----
def firstFactor(start: Long, target: Long): Long= {
	var factor = start
	while (factor < target){
		if(target%factor == 0){
			return factor
		}
		factor = factor + 1
	}
	target
}

def largestFactor(target: Long): Long={
	var newTarget: Long = target
	var start: Long = 2
	var factor: Long = firstFactor(start, newTarget)
	while (factor != newTarget){
		newTarget = newTarget/factor
		start = factor + 1L
		factor = firstFactor(start, newTarget)
	}
	factor
}

println(largestFactor(600851475143L))

