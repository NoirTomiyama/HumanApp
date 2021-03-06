package jp.techacademy.tomiyama.ryota.javalog;

import android.util.Log;

class Dog {

    // 変数
    String name; // 名前
    int age;     // 年齢

    // コンストラクタ
    public Dog(){
        name = "";
        age = 0;
    }

    // 引数付きコンストラクタ
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    // メソッド
    public void say(){
        Log.d("javatest", this.name + "(" + this.age + ")" + "「ワンワン」");
    }

}
