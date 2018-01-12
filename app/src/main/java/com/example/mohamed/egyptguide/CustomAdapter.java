package com.example.mohamed.egyptguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mohamed on 13/12/2017.
 */

public class CustomAdapter extends ArrayAdapter<Places> {
    public CustomAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.home_list, parent, false);
        }
        Places list1= getItem(position);
        ImageView home_image=(ImageView)listItemView.findViewById(R.id.home_image) ;
        home_image.setImageResource(list1.getImage());
        TextView home_title= (TextView) listItemView.findViewById(R.id.home_title);
        home_title.setText(list1.getTitle());
        TextView home_description =(TextView) listItemView.findViewById(R.id.home_description);
        home_description.setText(list1.getDescription());
        return listItemView;
    }

}

