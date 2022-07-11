package com.example.android.miwok;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter {
    private int mColorResourceaId;
    public WordAdapter(Activity context, ArrayList<word> words, int colorResourceaId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceaId = colorResourceaId;

    }




    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listv, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        word currentword = (word) getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentword.getDefaultTranslation());


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentword.getMiwokTranslation());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        if(currentword.hasImage()){
            iconView.setImageResource(currentword.getImageResourceId());
            iconView.setVisibility((View.VISIBLE));
        }
        else {
            iconView.setVisibility(View.GONE);
        }
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        View textContainer = listItemView.findViewById((R.id.text_container));
        int color = ContextCompat.getColor(getContext(),mColorResourceaId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
