object Main extends App { println("アプリケーションを実行しました") }

/* 学習メモ *
  * Scala のプログラムを書くファイルは、基本的に大文字始まりで単語の区切りを大文字にする「アッパーキャメルケース」を利用する。 
  * 「Main」という命名は、プログラムの主となる処理のことをメイン処理というため利用している。
  * .scala は、このファイルがプログラミング言語の Scala で記述されていることを示すための拡張子。
  * 「トレイト」  振る舞いを定義するもの。
  * 「ミックスイン」  その振る舞いをオブジェクトに対して追加すること。
  * println(プリントライン)関数は、引数に渡された文字列 "Hello Scala" をコンソールに出力して改行を行う。
  * Scala では、文字列は "" で囲うことで記述する。

  ■ １行目の意味
    * object Main   Mainというオブジェクトを宣言している (「何かしらの状態や処理を保持できる構造」が作られる)。
    * object Main extends App   Main というオブジェクトが、App というトレイトをミックスインしていることを宣言している。
    * println("Hello Scala")   Hello Scala という文字列をコンソールに出力し、改行する処理の宣言となる。

*/