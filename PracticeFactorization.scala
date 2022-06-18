// Factorization.scala の回の練習問題(REPLで PracticeFactorization.factorization(24) と呼び出し、 24 の素因数分解の結果を取得する！)
import scala.math.sqrt

object Factorization extends App {

  def factorization(target: Int): Map[Int, Int] = {
    val maxDivisor = sqrt(target).toInt

    def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int] = {
      ???
    }

    factorizationRec(target, 2, Map())
  }

  println(factorization(510510))
}