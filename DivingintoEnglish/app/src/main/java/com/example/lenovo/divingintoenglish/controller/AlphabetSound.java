package com.example.lenovo.divingintoenglish.controller;

import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import com.example.lenovo.divingintoenglish.R;

import java.io.File;

public class AlphabetSound extends Activity implements MediaPlayer.OnPreparedListener,
        MediaPlayer.OnCompletionListener {

        MediaPlayer mediaPlayer;
        AudioManager audioManager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_inside_alphabet);
                audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        }

        public void onClickStart(View view) {
                releaseMediaPlayer();
                switch (view.getId()) {
                        case R.id.button_letter:
                                File file = new File();
                                mediaPlayer = MediaPlayer.create(this, R.raw.a);
                                mediaPlayer.start();
                                break;
                        case R.id.button_word:
                                mediaPlayer = MediaPlayer.create(this, R.raw.anchor);
                                mediaPlayer.start();
                                break;

                }

                if (mediaPlayer == null)
                        return;
                mediaPlayer.setOnCompletionListener(this);
        }

        private void releaseMediaPlayer() {
                if (mediaPlayer != null) {
                        try {
                                mediaPlayer.release();
                                mediaPlayer = null;
                        } catch (Exception e) {
                                e.printStackTrace();
                        }
                }
        }

        @Override
        public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
        }

        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
        }

        @Override
        protected void onDestroy() {
                super.onDestroy();
                releaseMediaPlayer();
        }
        }