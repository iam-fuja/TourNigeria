package com.example.hp.tournigeria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //casts TextViews into objects
        TextView tinapa = findViewById(R.id.tinapa);
        TextView obudu = findViewById(R.id.obudu);
        TextView calabar = findViewById(R.id.calabar);
        TextView city = findViewById(R.id.city);


        //sets onClickListener on  Textview Objects to push into Intent
        tinapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tinapaIntent = new Intent(MainActivity.this, TinapaActivity.class);
                startActivity(tinapaIntent);
            }
        });

        obudu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent obuduIntent = new Intent(MainActivity.this, ObuduActivity.class);
                startActivity(obuduIntent);
            }
        });

        calabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calabarIntent = new Intent(MainActivity.this, CalabarActivity.class);
                startActivity(calabarIntent);
            }
        });

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cityIntent = new Intent(MainActivity.this, CityActivity.class);
                startActivity(cityIntent);
            }

        });

    }


}
