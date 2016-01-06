println((0 until 1000).filter(x => x%5 == 0 || x%3 == 0).sum)
var target = 1000 
println(0.to(target).by(3).sum + 0.to(target).by(5).sum - 0.to(target).by(15).sum)
println(Range(0, target,3).sum + Range(0, target, 5).sum - Range(0, target, 15).sum)

