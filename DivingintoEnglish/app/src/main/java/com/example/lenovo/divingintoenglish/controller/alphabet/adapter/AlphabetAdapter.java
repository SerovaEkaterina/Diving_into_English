package com.example.lenovo.divingintoenglish.controller.alphabet.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.controller.alphabet.InsideAlphabetActivity;
import com.example.lenovo.divingintoenglish.model.Alphabet;
import com.example.lenovo.divingintoenglish.utils.Constants;
import java.util.List;

public class AlphabetAdapter extends RecyclerView.Adapter<AlphabetAdapter.myViewHolder> {

    private List <Alphabet> alphabetsData;

    public AlphabetAdapter(List<Alphabet> alphabetsData){
        this.alphabetsData = alphabetsData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.cardview_alphabet, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final myViewHolder holder, final int position) {
        final Context context = holder.itemView.getContext();
        final Alphabet alphabet = alphabetsData.get(position);
        holder.letterName.setText(alphabet.getLetterName());
        holder.rootCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(context,InsideAlphabetActivity.class);
//                intent.putExtra(Constants.LetterPhotoExtra,alphabet.getLetterPhoto());
//                intent.putExtra(Constants.WordPhotoExtra, alphabet.getWordPhoto());
//                intent.putExtra(Constants.LetterTranscriptionExtra,alphabet.getLetterTranscription());
//                intent.putExtra(Constants.LetterPronunciationExtra,alphabet.getLetterPronunciation());
//                intent.putExtra(Constants.WordNameExtra, alphabet.getWordName());
//                intent.putExtra(Constants.WordTranscriptionExtra,alphabet.getWordTranscription());
//                intent.putExtra(Constants.WordTranslationExtra,alphabet.getWordTranslation());
//                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return alphabetsData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder  {

        ImageView letterPhoto,wordPhoto;
        TextView letterName,letterTranscription,wordName,wordTranscription,wordTranslation;
        CardView rootCard;
        Button letterPronunciation;

        public myViewHolder(View itemView) {
            super(itemView);
            letterPhoto = itemView.findViewById(R.id.image_letter);
            wordPhoto = itemView.findViewById(R.id.image_word);
            letterName = itemView.findViewById(R.id.letter);
            letterTranscription = itemView.findViewById(R.id.transcription_letter);
            wordName = itemView.findViewById(R.id.text_word);
            wordTranscription = itemView.findViewById(R.id.transcription_word);
            wordTranslation = itemView.findViewById(R.id.translation_word);
            rootCard = itemView.findViewById(R.id.cardview);
            letterPronunciation = itemView.findViewById(R.id.letter_pronunciation);
        }
    }
}
