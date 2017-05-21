package com.example.android.miwok;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jean on 5/13/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColor;

    public WordAdapter(Context context, ArrayList<Word> pWords, int pColor) {
        super(context, 0, pWords);

        mColor = pColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word my_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(my_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(my_word.getDefaultTranslation());
        ImageView imgRes = (ImageView) listItemView.findViewById(R.id.ImgResId);
        imgRes.setImageResource(my_word.getImgResourceId());
        if (my_word.getImgResourceId() == 0) {
            imgRes.setVisibility(View.GONE);
        }

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.TextContainer);
        int color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
