package jp.techacademy.tomiyama.ryota.javalog;

import android.util.Log;

class Human extends Animal{

    // コンストラクタ
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    // メンバ関数
    @Override
    public void say() {
        Log.d("javatest",String.format("「私の名前は%sです。年は%d歳です。」", this.name, this.age));
    }
}
