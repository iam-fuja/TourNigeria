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
public class ObuduFragment extends Fragment {

    public ObuduFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ipo_list, container, false);

        //Array List storing list of sub-locations
        final ArrayList<Ipo> ipo = new ArrayList<Ipo>(8);
        ipo.add(new Ipo(getString(R.string.obudu_mountain_ranch), getString(R.string.obudu_mountain_ranch_desc), R.drawable.obudu_cattle_ranch));
        ipo.add(new Ipo(getString(R.string.obudu_mountain_resort), getString(R.string.obudu_mountain_resort_desc), R.drawable.obudu_mountain_resort2));
        ipo.add(new Ipo(getString(R.string.obudu_mountain_path), getString(R.string.obudu_mountain_path_desc), R.drawable.obudu_side_attractions));
        ipo.add(new Ipo(getString(R.string.obudu_flora), getString(R.string.obudu_flora_desc), R.drawable.obudu_vegetation));
        ipo.add(new Ipo(getString(R.string.obudu_waterfalls), getString(R.string.obudu_waterfalls_desc), R.drawable.obudu_agbokim_waterfalls1));
        ipo.add(new Ipo(getString(R.string.obudu_cable_car), getString(R.string.obudu_cable_car_desc), R.drawable.obudu_cable_car));
        ipo.add(new Ipo(getString(R.string.obudu_landscape_view), getString(R.string.obudu_landscape_view_desc), R.drawable.obudu_landscape3));
        ipo.add(new Ipo(getString(R.string.obudu_waterpark), getString(R.string.obudu_waterpark_desc), R.drawable.obudu1));

        //cast view from adapter into listview
        IpoAdapter adapter = new IpoAdapter(getActivity(), ipo, R.color.obudu);
        ListView listView = rootView.findViewById(R.id.my_list);
        //sets List on Adapter
        listView.setAdapter(adapter);
        return rootView;
    }
}
