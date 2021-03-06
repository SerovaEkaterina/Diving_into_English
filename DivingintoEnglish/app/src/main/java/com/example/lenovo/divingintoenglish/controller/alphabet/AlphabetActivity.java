package com.example.lenovo.divingintoenglish.controller.alphabet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.lenovo.divingintoenglish.R;
import com.example.lenovo.divingintoenglish.controller.alphabet.adapter.AlphabetAdapter2;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import static com.example.lenovo.divingintoenglish.utils.FolderReader.getFileNameList;

public class AlphabetActivity extends AppCompatActivity {

    List<String> fileList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
      Field[] fields = R.raw.class.getFields();
        for(int i = 0; i < fields.length; i++){
            fileList.add(fields[i].getName());
        }
//        fileList.add("A",R.raw.a);
//        fileList.add("B",R.raw.b);

        AlphabetAdapter2 adapter = new AlphabetAdapter2(getFileNameList("android.resource://" + getPackageName() + "/raw/"));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        alphabetsList.add(new String(R.drawable.a, "A", "[эй]", R.drawable.jakor, "Anchor", "[áнкэ]", "Якорь"));
//        alphabetsList.add(new Alphabet(R.drawable.b, "B", "[би]", R.drawable.boat1, "Boat", "[бóут]", "Лодка"));
////        alphabetsList.add(new Alphabet(R.drawable.c,"C","[си]",R.drawable.crab2,"Crab","[крáб]","Краб"));
//        alphabetsList.add(new Alphabet(R.drawable.d,"D","[ди]",R.drawable.dolphin,"Dolphin","[дóлфин]","Дельфин"));
//        alphabetsList.add(new Alphabet(R.drawable.e,"E","[и]",R.drawable.eel,"Eel","[иéл]","Угорь"));
//        alphabetsList.add(new Alphabet(R.drawable.f,"F","[эф]",R.drawable.fish,"Fish","[фи́  ]","Рыба"));
//        alphabetsList.add(new Alphabet(R.drawable.g,"G","[джи]",R.drawable.gull,"Gull","[гал]","Чайка"));
//        alphabetsList.add(new Alphabet(R.drawable.h,"H","[эйч]",R.drawable.harbour,"Harbour","[хабэ]","Порт"));
//        alphabetsList.add(new Alphabet(R.drawable.i,"I","[ай]",R.drawable.island,"Island","[айлэнд]","Остров"));
//        alphabetsList.add(new Alphabet(R.drawable.j,"J","[джей]",R.drawable.jellifish,"Jellyfish","[джелли'фиш]","Медуза"));
//        alphabetsList.add(new Alphabet(R.drawable.k,"K","[кей]",R.drawable.kelp,"Kelp","[келп]","Бурая водоросль"));
//        alphabetsList.add(new Alphabet(R.drawable.l,"L","[эл]",R.drawable.lighthouse,"Lighthouse","[лайт'хаус]","Маяк"));
//        alphabetsList.add(new Alphabet(R.drawable.m,"M","[эм]",R.drawable.mast,"Mast","[маст]","Мачта"));
//        alphabetsList.add(new Alphabet(R.drawable.n,"N","[эн]",R.drawable.navigation,"Navigation","[навигэйшн]","Навигация"));
//        alphabetsList.add(new Alphabet(R.drawable.o,"O","[оу]",R.drawable.octopus,"Octopus","[октэпэс]","Осьминог"));
//        alphabetsList.add(new Alphabet(R.drawable.p,"P","[пи]",R.drawable.penguin,"Penguin","[пенг'уин]","Пингвин"));
//        alphabetsList.add(new Alphabet(R.drawable.q,"Q","[кью]",R.drawable.quicksand,"Quicksand","[к'уик'сэнд]","[Зыбучий песок]"));
//        alphabetsList.add(new Alphabet(R.drawable.r,"R","[ар]",R.drawable.river,"River","[рывэ]","Река"));
//        alphabetsList.add(new Alphabet(R.drawable.s,"S","[эс]",R.drawable.shark,"Shark","[ша'к]","Акула"));
//        alphabetsList.add(new Alphabet(R.drawable.t,"T","[ти]",R.drawable.turtle,"Turtle","[тё'тл]","Черепаха"));
//        alphabetsList.add(new Alphabet(R.drawable.u,"U","[ю]",R.drawable.umbrella,"Umbrella","[амбрэла]","Зонт"));
//        alphabetsList.add(new Alphabet(R.drawable.v,"V","[ви]",R.drawable.voyage,"Voyage","[воядж]","Путешествие"));
//        alphabetsList.add(new Alphabet(R.drawable.w,"W","[дабл'ю]",R.drawable.whale,"Whale","[уэйл]","Кит"));
//        alphabetsList.add(new Alphabet(R.drawable.x,"X","[экс]",R.drawable.x_ray_fish,"X-ray fish","[экс'рэй'фиш]","'Рентгеновская' рыба"));
//        alphabetsList.add(new Alphabet(R.drawable.y,"Y","[уай]",R.drawable.yacht,"Yacht","[ят]","Яхта"));
//        alphabetsList.add(new Alphabet(R.drawable.z,"Z","[зет",R.drawable.zooplankton,"Zooplankton","[зуэ'планктэн]","Зоопланктон"));

    }
}
