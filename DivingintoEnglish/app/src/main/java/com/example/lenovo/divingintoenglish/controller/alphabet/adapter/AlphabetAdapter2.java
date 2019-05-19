package com.example.lenovo.divingintoenglish.controller.alphabet.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.controller.alphabet.InsideAlphabetActivity;
import com.example.lenovo.divingintoenglish.model.Alphabet;
import com.example.lenovo.divingintoenglish.utils.Constants;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AlphabetAdapter2 extends RecyclerView.Adapter<AlphabetAdapter2VH> {

    private List <String> fileNameList;

    public AlphabetAdapter2(List<String> fileNameList) {
        this.fileNameList = fileNameList;
    }

    @NonNull
    @Override
    public AlphabetAdapter2VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.cardview_alphabet, viewGroup, false);
        return new AlphabetAdapter2VH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AlphabetAdapter2VH alphabetAdapter2VH, int i) {
        final Context context = alphabetAdapter2VH.itemView.getContext();
        alphabetAdapter2VH.rootCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> fileList = new ArrayList<>();
                Intent intent = new Intent(context,InsideAlphabetActivity.class);
                intent.putExtra("FILES_LIST", (Serializable) fileList);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return fileNameList.size();
    }
}

