package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Todo:
        ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one","ekk",R.drawable.number_one));
        words.add(new word("two","do",R.drawable.number_two));
        words.add(new word("three","teen",R.drawable.number_three));
        words.add(new word("four","chaar",R.drawable.number_four));
        words.add(new word("five","paanch",R.drawable.number_five));
        words.add(new word("six","che",R.drawable.number_six));
        words.add(new word("seven","saath",R.drawable.number_seven));
        words.add(new word("eight","aadh",R.drawable.number_eight));
        words.add(new word("nine","no",R.drawable.number_nine));
        words.add(new word("ten","das",R.drawable.number_ten));

        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,R.layout.listv, words);
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}