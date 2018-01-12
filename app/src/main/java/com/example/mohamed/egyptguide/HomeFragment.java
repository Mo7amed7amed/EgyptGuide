package com.example.mohamed.egyptguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list1, container, false);
        ArrayList<Places> places=new ArrayList<>();
        places.add(new Places(getString(R.string.alexandria),getString(R.string.desc_alex),R.drawable.alex1 ));
        places.add(new Places(getString(R.string.giza_pyramids),getString(R.string.desc_giza),R.drawable.giza1 ));
        places.add(new Places(getString(R.string.aswan),getString(R.string.desc_aswan),R.drawable.aswan1 ));
        places.add(new Places(getString(R.string.luxer),getString(R.string.desc_luxer),R.drawable.luxer1 ));
        places.add(new Places(getString(R.string.muizz_street),getString(R.string.desc_muizz),R.drawable.muizz1 ));
        places.add(new Places(getString(R.string.nile),getString(R.string.desc_nile),R.drawable.nile1 ));
        places.add(new Places(getString(R.string.alex_library),getString(R.string.desc_alex_lib),R.drawable.alex2 ));


        CustomAdapter customAdapter =new CustomAdapter(getActivity(),places);
        ListView list=rootView.findViewById(R.id.list);
        list.setAdapter(customAdapter);
        return rootView;
    }
}
