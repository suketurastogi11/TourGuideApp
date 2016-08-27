package com.example.suketurastogi.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SightSeeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final ArrayList<Location> locations = new ArrayList<> ();

        locations.add(new Location("India Gate", "Near Rajpath", R.drawable.india_gate));
        locations.add(new Location("Qutab Minar", "Mehrauli", R.drawable.qutab_minar));
        locations.add(new Location("Parliament House", "houses ministerial offices", R.drawable.parliment_house));


        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);
    }
}
