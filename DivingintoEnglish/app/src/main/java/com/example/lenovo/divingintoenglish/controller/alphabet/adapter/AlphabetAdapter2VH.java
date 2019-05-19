package com.example.lenovo.divingintoenglish.controller.alphabet.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.divingintoenglish.R;

public class AlphabetAdapter2VH extends RecyclerView.ViewHolder {

    //    ImageView letterPhoto,wordPhoto;
    TextView letterName;
    //        TextView letterTranscription,wordName,wordTranscription,wordTranslation;
    CardView rootCard;
//    Button letterPronunciation, wordPronunciation;

    public AlphabetAdapter2VH(@NonNull View itemView) {
        super(itemView);
//        letterPhoto = itemView.findViewById(R.id.image_letter);
//        wordPhoto = itemView.findViewById(R.id.image_word);
        letterName = itemView.findViewById(R.id.letter);
//        letterTranscription = itemView.findViewById(R.id.transcription_letter);
//        wordName = itemView.findViewById(R.id.text_word);
//        wordTranscription = itemView.findViewById(R.id.transcription_word);
//        wordTranslation = itemView.findViewById(R.id.translation_word);
        rootCard = itemView.findViewById(R.id.cardview);
//        letterPronunciation = itemView.findViewById(R.id.letter_pronunciation);
//        wordPronunciation = itemView.findViewById(R.id.word_pronunciation);
//    }
    }
}
