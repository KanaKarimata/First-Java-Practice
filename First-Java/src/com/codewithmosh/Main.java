package com.codewithmosh;

public class Main {
//{}の中身はブロック
//Javaのプログラムを作ることはクラスを作ること
//クラス名とプログラムのファイル名を合わせること
    public static void main(String[] args) {
        //処理のまとまりをメソッドという
        //Javaを実行するときに最初に実行されるメソッドはmainメソッド
        //;を打つ
        System.out.println("Javaを楽しもう！"); //画面表示
        //わかりやすいプログラムの書き方３つ
        //①メモ書きを残すこと＝コメント
        //１行のコメント
        /*複数行のコメント*/
        //②フォーマットを整える
        //③命名ルール
        //クラスやインターフェースは大文字から始める
        //変数やメソッド、パッケージは小文字から始める
        //２つ目以降の単語は大文字から

        //変数とは→データの入れもの
        //変数の使い方
        //①宣言する：２つの情報をかく
        //データ型　変数名、変数名…；
        //②代入する:変数名＝値；
        //③参照する：値をみる
        //①＋②：初期化
        //データ型　変数名　＝　値；
    }
}

class Variable {
    public static void main (String[] args) {
        int month;
        month = 9;
        int day = 16;

        System.out.println("このチャンネルは");
        System.out.println(month + "月" + day + "日に公開しました");
    }
}
