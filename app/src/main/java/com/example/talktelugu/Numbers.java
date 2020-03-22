package com.example.talktelugu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("సున్న","zero"));
        words.add(new Word("ఒకటి","one"));
        words.add(new Word("రెండు","two"));
        words.add(new Word("మూడు","three"));
        words.add(new Word("నాలుగు","four"));
        words.add(new Word("అయిదు","five"));
        words.add(new Word("ఆరు","six"));
        words.add(new Word("ఏడు","seven"));
        words.add(new Word("ఎనిమిది","eight"));
        words.add(new Word("తొమ్మిది","nine"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);



    }
}
