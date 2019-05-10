package com.example.lenovo.divingintoenglish.controller.alphabet;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.utils.Constants;

public class InsideAlphabetActivity extends AppCompatActivity {

    private ImageView letter_photo,word_photo;
    private TextView letter_transcription,word_name,word_transcription,word_translation;
    private Button letter_pronunciation;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_alphabet);

        int letterPhoto = getIntent().getIntExtra(Constants.LetterPhotoExtra, 0);
        int wordPhoto = getIntent().getIntExtra(Constants.WordPhotoExtra,0);
        String letterTranscription = getIntent().getStringExtra(Constants.LetterTranscriptionExtra);
        String wordName = getIntent().getStringExtra(Constants.WordNameExtra);
        String wordTranscription = getIntent().getStringExtra(Constants.WordTranscriptionExtra);
        String wordTranslation = getIntent().getStringExtra(Constants.WordTranslationExtra);

        letter_photo = findViewById(R.id.image_letter);
        word_photo = findViewById(R.id.image_word);
        letter_transcription = findViewById(R.id.transcription_letter);
        letter_pronunciation = findViewById(R.id.letter_pronunciation);
        word_name = findViewById(R.id.text_word);
        word_transcription = findViewById(R.id.transcription_word);
        word_translation = findViewById(R.id.translation_word);

        letter_pronunciation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Context context = v.getContext();
                    Uri uri = Uri.parse("android.resource://com.example.lenovo.divingintoenglish/raw/");
                    MediaPlayer player = new MediaPlayer();
                    player.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    player.setDataSource(context,uri);
                    player.prepare();
                    player.start();
                    player.reset();
                    player.release();
                } catch(Exception e) {
                    System.out.println(e.toString());
                }
            }
        });
        letter_photo.setImageResource(letterPhoto);
        word_photo.setImageResource(wordPhoto);
        letter_transcription.setText(letterTranscription);
        word_name.setText(wordName);
        word_transcription.setText(wordTranscription);
        word_translation.setText(wordTranslation);
    }
}
