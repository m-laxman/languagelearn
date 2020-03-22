package com.example.talktelugu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("సుస్వాగతం ", "welcome"));
        words.add(new Word("మీరు ఏలా ఉన్నారు ?", "How are you?"));
        words.add(new Word("\tనేను బాగున్నాను. మీరు ఏలా ఉన్నారు ?", "I am good/fine. How are you?"));
        words.add(new Word("చాలా కాలమైంది మిమ్మల్ని చూసి", "Long time no see"));
        words.add(new Word("మీ పేరేమండి ?", "What's your name?"));
        words.add(new Word("నా పేరు ... ", "My name is..."));
        words.add(new Word("మీరు ఎక్కడ నుంచి వచ్చారు ?", "Where are you from?"));
        words.add(new Word("\tనేను ... నుండి వచ్చాను", "I'm from ..."));
        words.add(new Word("మిమ్మల్ని కలవడం చాలా సంతోషంగా ఉంది", "Pleased to meet you"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
