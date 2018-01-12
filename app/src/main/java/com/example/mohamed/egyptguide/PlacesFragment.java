package com.example.mohamed.egyptguide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    public static final String POSITION = "position";

    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.list1, container, false);
        ArrayList<Places> places = new ArrayList<>();
        places.add(new Places(getString(R.string.alexandria)));
        places.add(new Places(getString(R.string.giza_pyramids)));
        places.add(new Places(getString(R.string.aswan)));
        places.add(new Places(getString(R.string.luxer)));
        places.add(new Places(getString(R.string.muizz_street)));
        places.add(new Places(getString(R.string.nile)));
        places.add(new Places(getString(R.string.alex_library)));
        CustomAdapter2 arrayAdapter = new CustomAdapter2(getContext(), places);
        final ListView list = (ListView) rootView.findViewById(R.id.list);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getContext(), PlacesActivity.class);
                    intent.putExtra(POSITION, position);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getContext(), PlacesActivity.class);
                    intent.putExtra(POSITION, position);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getContext(), PlacesActivity.class);
                    intent.putExtra(POSITION, position);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(getContext(), PlacesActivity.class);
                    intent.putExtra(POSITION, position);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(getContext(), PlacesActivity.class);
                    intent.putExtra(POSITION, position);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getContext(), PlacesActivity.class);
                    intent.putExtra(POSITION, position);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }
}
