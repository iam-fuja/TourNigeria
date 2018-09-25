package com.example.hp.tournigeria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TinapaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinapa);

        //Array List storing list of sub-locations
        ArrayList<Ipo> ipo = new ArrayList<Ipo>(7);
        ipo.add(new Ipo(getString(R.string.tinapa_ftz),"fuja", R.drawable.tinapa_ftz));
        ipo.add(new Ipo("Tinapa Lakeside Hotel", "fuja", R.drawable.tinapa_lakeside_hotel));
        ipo.add(new Ipo("Studio TInapa", "tolookosu", R.drawable.studio_tinapa2));
        ipo.add(new Ipo("Fisherman Wharf", "oyyisa", R.drawable.tinapa_fisherman_wharf3));
        ipo.add(new Ipo("Water Park", "temmokka", R.drawable.tinapa_waterpark));


        //cast view from adapter into listview
        IpoAdapter adapter = new IpoAdapter(this, ipo, R.color.tinapa);
        ListView listView = findViewById(R.id.my_list);
        //sets List on Adapter
        listView.setAdapter(adapter);

    }
}
