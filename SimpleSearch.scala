/* 【文字と文字列】

 * Scala において、文字や文字列は1種のデータなので、数値と同じように扱うことができる。
 * 文字列は、 String という型を用いて文字列を表現している。

 * Scala では、文字列は "abcde" のように、ダブルクォーテーションで囲って表現する。
   scala> "abcde"
   res0: String = abcde

 * Scala の文字列は、コレクションである Seq 型と同じように添字をつけることで文字を取り出すことができる。
   scala> "abcde"(0)
   res1: Char = a

   このように、() で添字の 0 を与えてやると最初の文字である a を取り出すことができる。
   Char は文字の型で、文字を意味する英単語 Character の略である。
   Char は、 2バイト(16ビット)のデータで、Unicode というエンコード(2進数の数値を文字に対応させる方法)で表現された文字となっている。

 * 「文字」は、1 文字をシングルクォーテーションで囲むことも可能。
  scala> 'a'
  res2: Char = a

 * ダブルクォーテーションで入力した場合は、文字ではなく文字列になってしまう。
  scala> "a"
  res3>: String = a

*/


/* 【文字列検索について】

 * 文字列検索には、「索引型検索」と「非索引型検索」の二通りのやり方が存在する。

 * 索引型検索
   文章の中からあらかじめ単語の文字列を抜き出して、その単語ごとに索引を作っておく検索方法。
   例えば、ある本の索引で「プログラミング」を調べると、 10P, 122p, 212p と書いてあったとすれば、10ページを開くとプログラミングについて書いてあるというような利用方法。
   この本では、あらかじめ単語の内容が本のどこに存在するかを索引に記録して、本につけてあるわけである。
   実際に索引をコンピューターで行う場合は、単語ごとに、対象の文章の中でどれぐらいその単語が利用されているかや、出現位置などに応じてスコアが計算される。
   そして、そのスコアに応じて膨大な文書群の中から適切な文章を探し出せるようになっている。
   Google などの Web 検索では、この索引型検索を利用している。
   索引のことを英語で index という。

 
