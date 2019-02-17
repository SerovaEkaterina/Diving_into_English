package com.example.lenovo.divingintoenglish.controller;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.lenovo.divingintoenglish.R;

public class MainActivity extends AppCompatActivity {

    TextView textView, textView2, textView3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView1);
        Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/vinetaDi.ttf");
        textView.setTypeface(myFont);

        textView2 = findViewById(R.id.textView2);
        Typeface myFont2 = Typeface.createFromAsset(getAssets(), "fonts/vinetaDi.ttf");
        textView2.setTypeface(myFont2);

        textView3 = findViewById(R.id.textView3);
        Typeface myFont3 = Typeface.createFromAsset(getAssets(), "fonts/vinetaDi.ttf");
        textView3.setTypeface(myFont3);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainSceneActivity.class);
                startActivity(intent);
            }
        });
    }
}
