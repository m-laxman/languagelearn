package com.example.talktelugu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("నలుపు", "black"));
        words.add(new Word("తెలుపు", "white"));
        words.add(new Word("ఎరుపు", "red"));
        words.add(new Word("నీలము", "blue"));
        words.add(new Word("నారింజ", "orange"));
        words.add(new Word("పచ్చ", "green or yellow"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
