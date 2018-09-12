package jp.techacademy.tomiyama.ryota.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    // 変数
    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    @Override
    public void say() {
        Log.d("javatest",String.format("「私の名前は%sです。年は%d歳です。」", this.name, this.age));
    }

    @Override
    public void think() {
        Log.d("javatest",String.format("「私は%sについて考える」", this.hobby));
    }
}
