package com.example.suketurastogi.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TransportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final ArrayList<Location> locations = new ArrayList<> ();

        locations.add(new Location("Delhi Transport Corporation (DTC)", "India's largest bus transport systems"));
        locations.add(new Location("Cycle-rickshaws", "Use them for joyrides"));
        locations.add(new Location("Delhi Metro", "City's existent transport infrastructure"));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);
    }
}
