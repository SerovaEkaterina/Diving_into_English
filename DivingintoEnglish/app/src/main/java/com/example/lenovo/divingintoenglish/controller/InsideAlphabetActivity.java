package com.example.lenovo.divingintoenglish.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.utils.Constants;

public class InsideAlphabetActivity extends AppCompatActivity {

    private ImageView letter_photo,word_photo;
    private TextView letter_transcription,word_name,word_transcription,word_translation;
    private Button letter_sound, word_sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_alphabet);

        int letterPhoto = getIntent().getIntExtra(Constants.letterPhotoExtra, 0);
        int wordPhoto = getIntent().getIntExtra(Constants.wordPhotoExtra,0);
        int letterSound = getIntent().getIntExtra(Constants.letterSoundExtra,0);
        int wordSound = getIntent().getIntExtra(Constants.wordSoundExtra,0);
        String letterTranscription = getIntent().getStringExtra(Constants.letterTranscriptionExtra);
        String wordName = getIntent().getStringExtra(Constants.wordNameExtra);
        String wordTranscription = getIntent().getStringExtra(Constants.wordTranscriptionExtra);
        String wordTranslation = getIntent().getStringExtra(Constants.wordTranslationExtra);

        letter_photo = findViewById(R.id.image_letter);
        word_photo = findViewById(R.id.image_word);
        letter_sound = findViewById(R.id.button_letter);
        word_sound = findViewById(R.id.button_word);
        letter_transcription = findViewById(R.id.transcription_letter);
        word_name = findViewById(R.id.text_word);
        word_transcription = findViewById(R.id.transcription_word);
        word_translation = findViewById(R.id.translation_word);

        letter_photo.setImageResource(letterPhoto);
        word_photo.setImageResource(wordPhoto);
        letter_sound.setRawInputType(letterSound);
        word_sound.setRawInputType(wordSound);
        letter_transcription.setText(letterTranscription);
        word_name.setText(wordName);
        word_transcription.setText(wordTranscription);
        word_translation.setText(wordTranslation);
    }
}
