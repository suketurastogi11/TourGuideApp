package com.example.suketurastogi.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ReligiousMonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        final ArrayList<Location> locations = new ArrayList<> ();

        locations.add(new Location(getString(R.string.religious_monuments_name_one), getString(R.string.religious_monuments_address_one), R.drawable.akshardham));
        locations.add(new Location(getString(R.string.religious_monuments_name_two), getString(R.string.religious_monuments_address_two), R.drawable.hanuman_mandir));
        locations.add(new Location(getString(R.string.religious_monuments_name_three), getString(R.string.religious_monuments_address_three), R.drawable.iscon_temple));
        locations.add(new Location(getString(R.string.religious_monuments_name_four), getString(R.string.religious_monuments_address_four), R.drawable.lotus_temple));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);
    }
}
