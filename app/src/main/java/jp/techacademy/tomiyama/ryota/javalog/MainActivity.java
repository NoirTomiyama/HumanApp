package jp.techacademy.tomiyama.ryota.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human1 = new Human("Taro Tanaka",23, "野球");
        human1.say();
        human1.think();

        Human human2 = new Human("Ichiro Taguchi", 30, "サッカー");
        human2.say();
        human2.think();

    }
}

