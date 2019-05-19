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
import java.io.IOException;

public class InsideAlphabetActivity extends AppCompatActivity {

    private ImageView letterPhoto, wordPhoto;
    private TextView letterTranscription, wordName, wordTranscription, wordTranslation;
    private Button letterPronunciation, wordPronunciation;

    private MediaPlayer player = new MediaPlayer();
    private Context context = getApplicationContext();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_alphabet);

        letterPhoto = findViewById(R.id.image_letter);
        wordPhoto = findViewById(R.id.image_word);
        letterTranscription = findViewById(R.id.transcription_letter);
        letterPronunciation = findViewById(R.id.letter_pronunciation);
        wordName = findViewById(R.id.text_word);
        wordTranscription = findViewById(R.id.transcription_word);
        wordTranslation = findViewById(R.id.translation_word);
        wordPronunciation = findViewById(R.id.word_pronunciation);

//        letterPronunciation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    preparePlayer("android.resource://" + getPackageName() + "/raw/" + sounds[1]);
//                } catch (Exception e) {
//                    System.out.println(e.toString());
//                }
//            }
//        });
//
//        wordPronunciation.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                try {
//                    preparePlayer("android.resource://" + getPackageName() + "/raw/" + sounds[2]);
//                } catch (Exception e) {
//                    System.out.println(e.toString());
//                }
//            }
//        });
//    }

        //Как читать папку
        //https://stackoverflow.com/questions/8646984/how-to-list-files-in-an-android-directory
//    private void preparePlayer(String path) throws IOException {
//        Uri uri = Uri.parse(path);
//        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
//        player.setDataSource(context, uri);
//        player.setVolume(1, 1);
//        player.prepare();
//        player.start();
//    }
    }
}
