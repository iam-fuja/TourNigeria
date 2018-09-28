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
public class CalabarFragment extends Fragment {

    public CalabarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.ipo_list, container, false);

        //Array List storing list of sub-locations
        final ArrayList<Ipo> ipo = new ArrayList<Ipo>(10);
        ipo.add(new Ipo(getString(R.string.calabar_aerialview), getString(R.string.calabar_aerialview_desc), R.drawable.calabar_city2));
        ipo.add(new Ipo(getString(R.string.calabar_marina), getString(R.string.calabar_marina_desc), R.drawable.calabar_marina1));
        ipo.add(new Ipo(getString(R.string.mary_slessor), getString(R.string.mary_slessor_desc), R.drawable.calabar_mary_slessor2));
        ipo.add(new Ipo(getString(R.string.calabar_restaurant1), getString(R.string.calabar_restaurant1_desc), R.drawable.calabar_native_kitchen));
        ipo.add(new Ipo(getString(R.string.calabar_restaurant2), getString(R.string.calabar_restaurant2_desc), R.drawable.calabar_harbour_delicacies));
        ipo.add(new Ipo(getString(R.string.calabar_festival1), getString(R.string.calabar_festival1_desc), R.drawable.calabar_festival_duke));
        ipo.add(new Ipo(getString(R.string.calabar_festival2), getString(R.string.calabar_festival2_desc), R.drawable.calabar_festival_style2));
        ipo.add(new Ipo(getString(R.string.calabar_festival3), getString(R.string.calabar_festival3_desc), R.drawable.calabr_festival_style));
        ipo.add(new Ipo(getString(R.string.calabar_festival4), getString(R.string.calabar_festival4_desc), R.drawable.calabar_ayade_bikers));
        ipo.add(new Ipo(getString(R.string.calabar_museum), getString(R.string.calabar_museum_desc), R.drawable.calabar_slave_trade_museum));

        //cast view from adapter into listview
        IpoAdapter adapter = new IpoAdapter(getActivity(), ipo, R.color.calabar);
        ListView listView = rootView.findViewById(R.id.my_list);
        //sets List on Adapter
        listView.setAdapter(adapter);
        return rootView;
    }

}
