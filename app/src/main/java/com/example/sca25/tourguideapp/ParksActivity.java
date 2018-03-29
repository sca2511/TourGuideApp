package com.example.sca25.tourguideapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(getString(R.string.ParkOneTitle), getString(R.string.ParkOneDesc), R.drawable.park));
        words.add(new Word(getString(R.string.ParkTwoTitle), getString(R.string.ParkTwoDesc), R.drawable.park2));
        words.add(new Word(getString(R.string.ParkThreeTitle), getString(R.string.ParkThreeDesc), R.drawable.park3));
        words.add(new Word(getString(R.string.ParkFourTitle), getString(R.string.ParkFourDesc), R.drawable.dog));

        WordAdapter adapter = new WordAdapter(this, words, R.color.park_color);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
