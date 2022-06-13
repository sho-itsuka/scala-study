// 素因数分解のアプリケーションのオブジェクトを作る
import scala.math.sqrt

object Factorization extends App {
  val target = 24
  val maxDivisor = sqrt(target).toInt

  println(maxDivisor)

}


/* 学習メモ

  * factorization は、英語で因数分解のこと。

  * シーケンスを表す Seq
    シーケンスという1つの種類の型から構成される要素のコレクション。
    配列と同じように添字も利用できる。内部的な実装は異なるが、使い方はほとんど配列と同じ。

    REPL にて、 Seq(1, 2, 3)を実行
      scala > Seq(1, 2, 3)
      res0: Seq[Int] = List(1, 2, 3)

    Seq(1, 2, 3)は、1と2と3という3つの値が含まれるシーケンスである。
    型はseq[Int]となり、Int型が含まれるSeqとして表現される。
    実際の内部実装には List という型が利用されているため、List(1, 2, 3)と表示される。

    res0[0]のように添字でアクセスすると、
      scala > res0(0)
      res1: Int = 1
    上記のように添字の値が取得される。

    Scala ではこのようなコレクションは基本的に普遍のコレクションで、値を追加する際には要素が追加された新しいSeqを作成する。
    要素を増やすには、
      scala > res0 :+ 4
      res2: Seq[Int] = List(1, 2, 3, 4)
    :+ という演算子で 4 を要素に足した Seq を作成可能である。
    :+ は Seq が持つメソッド。


  * 連想配列を表す Map
    お馴染みの連想配列。REPL でMap("key1" -> 1, "key" -> 2)と入力し、連想配列を作成してみる。
      scala > Map("key1" -> 1, "key" -> 2)
      res3: scala.collection.immutable.Map[String,Int] = Map(key -> 1, key2 -> 2)

    
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
