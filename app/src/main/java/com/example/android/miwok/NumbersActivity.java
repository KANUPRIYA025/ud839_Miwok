package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
 private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Todo:
        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","ekk",R.drawable.number_one,R.raw.number_one));
        words.add(new word("two","do",R.drawable.number_two,R.raw.number_two));
        words.add(new word("three","teen",R.drawable.number_three,R.raw.number_three));
        words.add(new word("four","chaar",R.drawable.number_four,R.raw.number_four));
        words.add(new word("five","paanch",R.drawable.number_five,R.raw.number_five));
        words.add(new word("six","che",R.drawable.number_six,R.raw.number_six));
        words.add(new word("seven","saath",R.drawable.number_seven,R.raw.number_seven));
        words.add(new word("eight","aadh",R.drawable.number_eight,R.raw.number_eight));
        words.add(new word("nine","no",R.drawable.number_nine,R.raw.number_nine));
        words.add(new word("ten","das",R.drawable.number_ten,R.raw.number_ten));

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,R.layout.listv, words);
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                word Word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this,Word.getmAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}