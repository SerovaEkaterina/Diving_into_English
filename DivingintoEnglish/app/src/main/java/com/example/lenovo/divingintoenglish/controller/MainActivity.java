package com.example.lenovo.divingintoenglish.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.controller.alphabet.AlphabetActivity;

public class MainActivity extends AppCompatActivity {

    Button button1;
    LinearLayout linearLayout;
    ImageView bubble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_pressme);
        button1.setTag(0);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView textView1 = findViewById(R.id.name1);
                final TextView textView2 = findViewById(R.id.name2);
                final TextView textView3 = findViewById(R.id.name3);
                final TextView textView4 = findViewById(R.id.myImageViewText);
                final int status = (Integer) v.getTag();
                switch (status) {
                    case 0:
                        textView1.setText("Погружение");
                        textView1.setTextSize(50);
                        textView2.setText("в");
                        textView2.setTextSize(50);
                        textView3.setText("Английский");
                        textView3.setTextSize(50);
                        textView4.setText("Поплыли!");
                        textView4.setTextSize(14);
                        v.setTag(1);
                        break;
                    case 1:
                        textView1.setText("Diving");
                        textView1.setTextSize(60);
                        textView2.setText("into");
                        textView2.setTextSize(60);
                        textView3.setText("English");
                        textView3.setTextSize(60);
                        textView4.setText("Go");
                        textView4.setTextSize(16);
                        v.setTag(0);
                        break;
                }
            }
        });

        linearLayout = findViewById(R.id.linearlayout);
        Animation moveNameAnimation = AnimationUtils.loadAnimation(this, R.anim.move_name);
        linearLayout.startAnimation(moveNameAnimation);

        bubble = findViewById(R.id.waterball);
        bubble.isClickable();
        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AlphabetActivity.class);
                startActivity(intent);
            }
        });
     }
}

