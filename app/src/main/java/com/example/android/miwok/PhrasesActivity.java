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

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("minto wuksus", "Where are you going?", R.raw.phrase_where_are_you_going, ""));
        words.add(new Word("tinnә oyaase'nә", "What is your name?", R.raw.phrase_what_is_your_name, ""));
        words.add(new Word("oyaaset", "My name is...", R.raw.phrase_my_name_is, ""));
        words.add(new Word("michәksәs?", "daughter", R.raw.phrase_my_name_is, ""));
        words.add(new Word("taachi", "older brother", R.raw.phrase_where_are_you_going, ""));
        words.add(new Word("teṭe", "How are you feeling?", R.raw.phrase_how_are_you_feeling, ""));
        words.add(new Word("kuchi achit", "I’m feeling good.", R.raw.phrase_im_feeling_good, ""));
        words.add(new Word("әәnәs'aa?", "Are you coming?", R.raw.phrase_are_you_coming, ""));
        words.add(new Word("hәә’ әәnәm", "Yes, I’m coming.", R.raw.phrase_yes_im_coming, ""));
        words.add(new Word("әnni'nem", "Come here.", R.raw.phrase_come_here, ""));

//        Carry LinearLayout on Object
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.RootView);

//        for (int i = 0; i < words.size() ; i++) {
//            TextView wordTextView = new TextView(this);
//            wordTextView.setText(words.get(i));
//            rootView.addView(wordTextView);
////            Log.v("JeanLogV", words.get(i));
//        }

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        //play sound file
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Word word = words.get(i);

                MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getSoundFile());

                mediaPlayer.start();

                Toast.makeText(PhrasesActivity.this, word.getDefaultTranslation(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
