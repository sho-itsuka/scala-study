object PartialSumDFS extends App {
  val a = Seq(3, 4, -5, -7)
  val n = a.length
  val k = 8

  def isMatchAndResult(index: Int, partial: Seq[Int]: (Boolean, Seq[Int]) = {
    if(index == n) {
      return if (partial.sum == k) (true, partial) else (false, Seq())
    }
    val (isMatchNotAdd, resultNotAdd) = isMatchAndResult(index + 1, partial)
    if(isMatchNotAdd, resultNotAdd) = isMatchAndResult(index + 1, partial)

    isMatchAndResult(index + 1, partial :+ 1(index))
  }

  val (isMatch, result) = isMatchAndResult(0, Seq())
  if(isMatch) println(s"Yes ${result}") else println("No")
}
