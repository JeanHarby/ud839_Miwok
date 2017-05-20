/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);
        try {

            //Display numbers from 1 to 10 3 times

            ArrayList<Word> words = new ArrayList<Word>();
            words.add(new Word("lutti", "One", R.drawable.number_one));
            words.add(new Word("otiiko", "Two", R.drawable.number_two));
            words.add(new Word("tolookosu", "Three", R.drawable.number_three));
            words.add(new Word("oyyisa", "Four", R.drawable.number_four));
            words.add(new Word("massokka", "Five", R.drawable.number_five));
            words.add(new Word("temmokka", "Six", R.drawable.number_six));
            words.add(new Word("kenekaku", "Seven", R.drawable.number_seven));
            words.add(new Word("kawinta", "Eight", R.drawable.number_eight));
            words.add(new Word("wo’e", "Nine", R.drawable.number_nine));
            words.add(new Word("na’aacha", "Ten", R.drawable.number_ten));

            words.add(new Word("lutti", "One", R.drawable.number_one));
            words.add(new Word("otiiko", "Two", R.drawable.number_two));
            words.add(new Word("tolookosu", "Three", R.drawable.number_three));
            words.add(new Word("oyyisa", "Four", R.drawable.number_four));
            words.add(new Word("massokka", "Five", R.drawable.number_five));
            words.add(new Word("temmokka", "Six", R.drawable.number_six));
            words.add(new Word("kenekaku", "Seven", R.drawable.number_seven));
            words.add(new Word("kawinta", "Eight", R.drawable.number_eight));
            words.add(new Word("wo’e", "Nine", R.drawable.number_nine));
            words.add(new Word("na’aacha", "Ten", R.drawable.number_ten));
//        Carry LinearLayout on Object
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.RootView);

//        for (int i = 0; i < words.size() ; i++) {
//            TextView wordTextView = new TextView(this);
//            wordTextView.setText(words.get(i));
//            rootView.addView(wordTextView);
////            Log.v("JeanLogV", words.get(i));
//        }

            WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        } catch (Exception e) {
            // This will catch any exception, because they are all descended from Exception
            Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
}
