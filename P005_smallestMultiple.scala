println((2 to 20).filter(n => !(2 until n).exists(n%_ == 0)).map(x => Math.pow(x, Math.floor(Math.log(20)/Math.log(x))).toInt).reduce((a, b)=>a*b))
