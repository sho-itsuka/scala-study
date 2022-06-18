// 素因数分解のアプリケーション
import scala.math.sqrt

object Factorization extends App {
  val target = 24
  val maxDivisor = sqrt(target).toInt

  def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]):Map[Int, Int] = {
    if (divisor > maxDivisor) {
      if (num == 1) acc else acc + (num -> 1)
    } else if (num % divisor == 0) {
      val nextAcc = acc + (divisor -> (acc.getOrelse(divisor, 0) + 1))
      factorizationRec(num / divisor, divisor, nextAcc)
    } else {
      factorizationRec(num, divisor + 1, acc)
    }
  }

  println(factorizationRec(target, 2, Map()))
}


/* 解説
 2 | import scala.math.sqrt
    平方根を求める関数 def sqrt(x:Double): Double を利用できるようにしている。

 6 | val maxDivisor = sqrt(target).toInt
    sqrt 関数を利用して「割る数の最大値」を計算している。
    ただし、sqrt 関数は戻り値の型が浮動小数点数であるDouble値であるため、toInt メソッドを呼ぶことでInt型に変換している。
    これで小数点部分は切り捨てられる。

 8 | def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int]
    引数は、現在の数値である「割られる数」をInt型のnum、「割る数」をInt型のdivisor、ここまでの結果を Map[Int, Int]型のaccとして、キー・値ともにInt型の連想配列として定義した。
    戻り値も同様に、Map[Int, Int] としている。
    ※ accとは、 accumulator(アキュムレーター)の略で、累算器の意。

 9  | if (divisor > maxDivisor) {
 10 |   if (num == 1) acc else acc + (num -> 1)
    「割る数」 divisor が、「割る数」の最大値 maxDivisor より大きくなってしまった時に、現在までの結果 acc に今の「割られる数」 num を足した結果を答えにする。
    ただし、「割られる数」 num が 1 の場合は、1 は約数にならないので足さず、そのままの結果を返す。

 11 | } else if (num % divisor == 0) {
 12 |   val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1))
 13 |   factorizationRec(num / divisor, divisor, nextAcc)
    これは「割る数 divisor で割り切れる」の実装である。

    12行目は、現在の「結果」accを元に、現在の「結果」のキーの答えが 1 多くなるような、nextAcc という値を作っている。
    Scala では、連想配列の Map に、 Map() + (key -> value) という形式で記述することにより、そのキーの値を、 key と value で更新したい Map を取得できる。
    ここでは、「割る数」である divisor をキーに、 acc.getOrElse(divisor, 0) で得られる現在の割った回数に1を足した値のものを取得している。

    Map の getOrElse メソッドは、第一引数にはそのキーを与え、第二引数にキーの値がなかった場合の値を設定できる。
    そのため、ここでは「割る数」 divisor に対して、値が設定されていなかった際には 0 が取得される。

 14 | } else {
 15 |   factorizationRec(num, divisor + 1, acc)
    これは割り切れなかった場合の記述である。
    「割られる数」 num は、そのまま「割る数」 divisor を 1 足して、「結果」 acc も同じものを利用して再帰呼び出しを行う。 
 
 19 | println(factorizationRec(target, 2, Map()))
  関数の呼び出しで対象となる数をtarget、再帰を始める「割る数」 divisorの初期値を2、連想配列は空を表すMap()として呼び出してある。

*/


/* 学習メモ

  * factorization は、英語で因数分解のこと。

  * シーケンス(あらかじめ決められた順序で処理を行う)を表す Seq
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
    お馴染みの連想配列(連想配列：好きな添字をつけられる配列)。
      REPL で Map("key1" -> 1, "key" -> 2)と入力し、連想配列を作成してみる。

      scala > Map("key1" -> 1, "key" -> 2)
      res3: scala.collection.immutable.Map[String,Int] = Map(key -> 1, key2 -> 2)
      
      scala.collection.immutable.Map[String,Int]は、実際の型が scala.collection.immutable.Map であり、キーの型がInt型であることを表している。
      

      次に、 res3("key2") と入力してみる。

      scala> res3("key2")
      res4: Int = 2

      キーを () で引数で与えると、その値が取得される。
      また、この Map も基本的には普遍のコレクションである。
      キーと値の組み合わせを追加したい場合には、res3 + ("key3" -> 3)のように入力すると、

      scala> res3 + ("key3" -> 3)
      res5: scala.collection.immutable.Map[String,Int] = Map(key1 -> 1, key2 -> 2, key3 -> 3)

      以上のように、

      Map(key1 -> 1, key2 ->2, key3 -> 3) というキーと値が新たに追加された連想配列が作成される。




    
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
