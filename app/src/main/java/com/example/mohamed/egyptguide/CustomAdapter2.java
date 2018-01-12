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
 * Created by Mohamed on 14/12/2017.
 */

public class CustomAdapter2 extends ArrayAdapter<Places> {
    public CustomAdapter2(Context context, ArrayList<Places> places) {
        super(context, 0, places);
        }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.city_list, parent, false);
        }
        Places list2 = getItem(position);
        ImageView city_image = (ImageView) listItemView.findViewById(R.id.city_image);
        city_image.setImageResource(list2.getImage());
        TextView city_title = (TextView) listItemView.findViewById(R.id.city_title);
        city_title.setText(list2.getTitle());
        TextView city_description = (TextView) listItemView.findViewById(R.id.city_description);
        city_description.setText(list2.getDescription());
        return listItemView;
    }
}
