package com.example.suketurastogi.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        TextView sightSeeing = (TextView) findViewById(R.id.sight_seeing);

        sightSeeing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the transport category is clicked on.
            @Override
            public void onClick(View view) {

                Intent sightSeeingIntent = new Intent(MainActivity.this, SightSeeingActivity.class);
                startActivity(sightSeeingIntent);
            }
        });

        TextView transport = (TextView) findViewById(R.id.transport);

        transport.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent transportIntent = new Intent(MainActivity.this, TransportActivity.class);
                startActivity(transportIntent);
            }
        });

        TextView shopping = (TextView) findViewById(R.id.shopping);

        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        TextView religiousMonuments = (TextView) findViewById(R.id.religious_monuments);

        religiousMonuments.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                Intent religiousMonumentsIntent = new Intent(MainActivity.this, ReligiousMonumentsActivity.class);
                startActivity(religiousMonumentsIntent);
            }
        });

    }
}
