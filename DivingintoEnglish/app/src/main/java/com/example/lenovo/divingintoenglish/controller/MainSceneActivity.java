package com.example.lenovo.divingintoenglish.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.controller.alphabet.AlphabetActivity;
import com.example.lenovo.divingintoenglish.controller.grammar.GrammarActivity;

public class MainSceneActivity extends AppCompatActivity {

    Button button1,button2,button3;
    TextView text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_scene);

        text1 = findViewById(R.id.zitata_eng);
        text2 = findViewById(R.id.author_eng);
        text3 = findViewById(R.id.zitata_rus);
        text4 = findViewById(R.id.author_rus);

        button1 = findViewById(R.id.button_alfavit);
        button2 = findViewById(R.id.button_grammar);
        button3 = findViewById(R.id.sound);

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
    }
}
