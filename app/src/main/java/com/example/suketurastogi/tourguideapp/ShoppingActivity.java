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

        locations.add(new Location(getString(R.string.shopping_name_one), getString(R.string.shopping_address_one)));
        locations.add(new Location(getString(R.string.shopping_name_two), getString(R.string.shopping_address_two)));
        locations.add(new Location(getString(R.string.shopping_name_three), getString(R.string.shopping_address_three)));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);
    }
}
