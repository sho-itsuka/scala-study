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

 5 | val maxDivisor = sqrt(target).toInt
    sqrt 関数を利用して「割る数の最大値」を計算している。
    ただし、sqrt 関数は戻り値の型が浮動小数点数であるDouble値であるため、toInt メソッドを呼ぶことでInt型に変換している。
    これで小数点部分は切る捨てられる。
    最後に println 関数で「悪数の最大値」をコンソールに出力してある。


 */
