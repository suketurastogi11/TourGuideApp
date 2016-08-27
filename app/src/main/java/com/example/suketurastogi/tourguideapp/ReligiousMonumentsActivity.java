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

        locations.add(new Location("Akshardham Temple", "Near Nizamuddin Bridge, New Delhi",R.drawable.akshardham ));
        locations.add(new Location("Hanuman Mandir", "Baba Kharak Singh Marg, New Delhi ",R.drawable.hanuman_mandir ));
        locations.add(new Location("Iskcon Temple", "Near East of Kailash, New Delhi",R.drawable.iscon_temple ));
        locations.add(new Location("Lotus Temple", "Nehru Place, New Delhi",R.drawable.lotus_temple ));

        LocationAdapter adapter = new LocationAdapter(this, locations);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);
    }
}
