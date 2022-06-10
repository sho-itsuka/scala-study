object Distance extends App {
  val kilometersPerHours = 11.0
  val minutes = 100.0
  val distance = kilometersPerHours * minutes / 60.0
  println(s"走った距離は${distance}キロメートルです")
}


/* 学習メモ

■ val
  Scalaにおける定数宣言( JavaScript でいう const と似た性質)

■ 文字列の中で変数を利用する記述の仕方
  文字列のリテラルの前に s を記述することで、${変数} で変数を文字列の中で読み出すことができる。

■ Scalaにおける割り算
  / 演算子による計算は、余りを無視する。
  それを回避するには、あらかじめすべての値を浮動小数点数で与えておく必要がある。

*/