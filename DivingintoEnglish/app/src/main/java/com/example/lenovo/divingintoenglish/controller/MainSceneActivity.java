package com.example.lenovo.divingintoenglish.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.lenovo.divingintoenglish.R;

public class MainSceneActivity extends AppCompatActivity {

    Button button1,button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scene);

        button1 = findViewById(R.id.button_alfavit);
        button2 = findViewById(R.id.button_grammar);
        button3 = findViewById(R.id.button_video);
        button4 = findViewById(R.id.button_histories);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainSceneActivity.this, AlphabetActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainSceneActivity.this, GrammarActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainSceneActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainSceneActivity.this, StoriesActivity.class);
                startActivity(intent);
            }
        });
    }
}
