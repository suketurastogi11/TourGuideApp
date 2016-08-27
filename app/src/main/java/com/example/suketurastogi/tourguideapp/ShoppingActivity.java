package com.example.suketurastogi.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);
        final ArrayList<Location> locations = new ArrayList<> ();

        locations.add(new Location("Hauz Khas Village Market", "South Extension"));
        locations.add(new Location("Connaught Place", "Chandni Chowk"));
        locations.add(new Location("Sarojini Nagar", "Khan Market"));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);
    }
}
