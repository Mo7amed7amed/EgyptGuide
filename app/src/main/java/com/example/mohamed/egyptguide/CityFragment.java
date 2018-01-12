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
public class CityFragment extends Fragment {


    public CityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list1, container, false);

        ArrayList<Places> places=new ArrayList<>();
        places.add(new Places(getString(R.string.nile),getString(R.string.desc_nile),R.drawable.nile1 ));
        places.add(new Places(getString(R.string.muizz_street),getString(R.string.desc_muizz),R.drawable.muizz1 ));
        places.add(new Places(getString(R.string.market),getString(R.string.desc_muizz_market),R.drawable.one ));
        places.add(new Places(getString(R.string.giza_pyramids),getString(R.string.desc_giza),R.drawable.giza1 ));
        places.add(new Places(getString(R.string.muizz_street),getString(R.string.desc_muizz_street_view),R.drawable.three ));
        places.add(new Places(getString(R.string.muizz_street),getString(R.string.desc_muizz_street_view),R.drawable.six ));
        places.add(new Places(getString(R.string.giza_pyramids),getString(R.string.desc_giza),R.drawable.giza1 ));

        CustomAdapter2 customAdapter =new CustomAdapter2(getActivity(),places);
        ListView list=(ListView) rootView.findViewById(R.id.list);
        list.setAdapter(customAdapter);
        return rootView;
    }

}
