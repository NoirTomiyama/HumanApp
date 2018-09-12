package jp.techacademy.tomiyama.ryota.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human1 = new Human("Taro Tanaka",23);
        human1.say();

        Human human2 = new Human("Ichiro Taguchi", 30);
        human2.say();


    }
}

