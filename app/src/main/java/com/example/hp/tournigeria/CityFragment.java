package com.example.hp.tournigeria;


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
        View rootView = inflater.inflate(R.layout.ipo_list, container, false);

        //Array List storing list of sub-locations
        final ArrayList<Ipo> ipo = new ArrayList<Ipo>(5);
        ipo.add(new Ipo(getString(R.string.city_lag), getString(R.string.city_lag_desc), R.drawable.city_lagos_ikoyi));
        ipo.add(new Ipo(getString(R.string.city_lag1), getString(R.string.city_lag1_desc), R.drawable.lagos_metropolis));
        ipo.add(new Ipo(getString(R.string.city_kano), getString(R.string.city_kano_desc), R.drawable.city_kano));
        ipo.add(new Ipo(getString(R.string.city_ph), getString(R.string.city_ph_desc), R.drawable.city_port_harcourt));
        ipo.add(new Ipo(getString(R.string.city_atlantic), getString(R.string.city_atlantic_desc), R.drawable.eko_atlantic_city_lagos_nigeria_illustration));

        //cast view from adapter into listview
        IpoAdapter adapter = new IpoAdapter(getActivity(), ipo, R.color.city);
        ListView listView = rootView.findViewById(R.id.my_list);
        //sets List on Adapter
        listView.setAdapter(adapter);
        return rootView;
    }

}
