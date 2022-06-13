import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)
  
  println(factorial(1000))
}


/* 学習メモ

1 | import scala.math.BigInt
  *これは、BigIntという任意精度整数の型を読み込んでいる。
  *import文は、このファイルで定義されていない型や関数を、このファイルで利用できるようにする宣言。
  *Scala において、通常扱われる整数 Int は、内部的には 32bit で表現され、最大値は -2147483648 から 2147483647 までの整数しか表現できない。
  *そのため、BigInt という Int の上限を超えて、コンピュータのリソースが許す限りの大きな整数を表すことができる型である BigInt を利用する。

3 | object Factorial extends App {}
  *オブジェクト Factorial の宣言。

4 | def factorial(i: BigInt): BigInt = if (i == 0)1 else i * factorial(i - 1)
  *階乗を表現するための関数。
  *関数宣言は、def という宣言ではじめ、ここでは factorial という名前の関数名を定義している。
  *関数名の後の最初のカッコ()には、引数を宣言する。
  *引数には型を設定でき、 i:BigInt では、BigInt をいう型で i という引数を宣言している。
  *また、関数の最後には、 def factorial(i: BigInt): BigInt のように、 :BigInt が再度書かれているが、これは関数の戻り値が BigInt となるということを表している。
  *関数の戻り値の型の後には = を書き、それ以降は関数自体の処理を表す。
  *JavaScript では if文があったが、if文と違い、条件式で与えられた真偽値が正であれば if の直後の値を、負であれば else の直後の値が返される。
  *Scala において、真偽値は true と false で表される。
  *4行目の式の意味は、「 i が 0 である場合には 1 を値をして返し、そうでない場合には i かける i-1 の階乗である」と定義されている。
  *factorial は再帰関数として宣言されており、 0 の階乗は 1 、それ以外の整数i の場合には、i かける i-1 の階乗であると定義されている。

6 | println(factorial(1000))
  *以上の実装は、1000の階乗の値をコンソールに出力して改行するものとなっている。

■ まとめ
  *Scala の数値は、整数と浮動小数点数で異なるデータの持ち方をする。
  *Scala では、整数同士の割り算の結果では、小数点以下の値は無視されてしまう。
  *非常に大きな整数を扱う際には、BigInt を利用する。

  */



/* 問題
  1, 129512円(税抜)のPCを消費税10%で購入した時の、税込の金額はいくらか(円未満切り捨て)。
    scala> (129512 * 1.1).toInt
    res0: Int = 142463

  2, スタックオーバーフローが発生しないようにコードを修正する
      *スタックオーバーフロー：再帰呼び出しには上限があり、その上限を超えたために起こってしまう例外のこと(保持するべき値が多くなりすぎてコンピューターが覚えきれなくなるために起こる)。

      import scala.math.BigInt

      object FactorialTailRec extends App {
        def factorial(i: BigInt, acc: BigInt): BigInt = if (i == 0) acc else (i - 1, i * acc)
        println(factorial(30000,1))
      }
    
    再帰関数の戻り値が必ず【再帰関数の呼び出し】 or 【値】 となるように再帰関数を実装すると、内部的にループの表現に変換される末尾再帰最適化が行われる。
    ここでは、acc(accumulator(アキュムレーター)の略、貯める・蓄積する) という引数を定義し、末尾再帰最適化が起こるように修正してある。

*/
  