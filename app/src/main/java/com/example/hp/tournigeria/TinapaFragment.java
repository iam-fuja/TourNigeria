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
public class TinapaFragment extends Fragment {

    public TinapaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ipo_list, container, false);

        //Array List storing list of sub-locations
        final ArrayList<Ipo> ipo = new ArrayList<Ipo>(6);
        ipo.add(new Ipo(getString(R.string.tinapa_ftz), getString(R.string.tinapa_ftz_desc), R.drawable.tinapa_ftz));
        ipo.add(new Ipo(getString(R.string.tinapa_hotel), getString(R.string.tinapa_hotel_desc), R.drawable.tinapa_lakeside_hotel));
        ipo.add(new Ipo(getString(R.string.tinapa_studio), getString(R.string.tinapa_studio_desc), R.drawable.studio_tinapa2));
        ipo.add(new Ipo(getString(R.string.tinapa_wharf), getString(R.string.tinapa_wharf_desc), R.drawable.tinapa_fisherman_wharf3));
        ipo.add(new Ipo(getString(R.string.tinapa_transport), getString(R.string.tinapa_transport_desc), R.drawable.tinapa_shuttle));
        ipo.add(new Ipo(getString(R.string.tinapa_waterpark), getString(R.string.tinapa_waterpark_desc), R.drawable.tinapa_waterpark));

        //cast view from adapter into listview
        IpoAdapter adapter = new IpoAdapter(getActivity(), ipo, R.color.tinapa);
        ListView listView = rootView.findViewById(R.id.my_list);
        //sets List on Adapter
        listView.setAdapter(adapter);
        return rootView;
    }

}
