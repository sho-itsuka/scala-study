import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)
  
  println(factorial(1000))
}


/* 学習メモ

1 | import scala.math.BigInt
  これは、BigIntという任意精度整数の型を読み込んでいる。
  import文は、このファイルで定義されていない型や関数を、このファイルで利用できるようにする宣言。
  Scala において、通常扱われる整数 Int は、内部的には 32bit で表現され、最大値は -2147483648 から 2147483647 までの整数しか表現できない。
  そのため、BigInt という Int の上限を超えて、コンピュータのリソースが許す限りの大きな整数を表すことができる型である BigInt を利用する。

3 | object Factorial extends App {}
  オブジェクト Factorial の宣言。

4 | def factorial(i: BigInt): BigInt = if (i == 0)1 else i * factorial(i - 1)
  階乗を表現するための関数。
  関数宣言は、def という宣言ではじめ、ここでは factorial という名前の関数名を定義している。
  関数名の後の最初のカッコ()には、引数を宣言する。
  引数には型を設定でき、 i:BigInt では、BigInt をいう型で i という引数を宣言している。
  また、関数の最後には、 def factorial(i: BigInt): BigInt のように、 :BigInt が再度書かれているが、これは関数の戻り値が BigInt となるということを表している。
  関数の戻り値の型の後には = を書き、それ以降は関数自体の処理を表す。