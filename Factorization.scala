// 素因数分解のアプリケーションのオブジェクトを作る
import scala.math.sqrt

object Factorization extends App {
  val target = 24
  val maxDivisor = sqrt(target).toInt

  println(maxDivisor)

}


/* 学習メモ
  * factorization は、英語で因数分解のこと。
  * 
*/


/* 解説
 1 | import scala.math.sqrt
    平方根を求める関数 def sqrt(x:Double): Double を利用できるようにしている。