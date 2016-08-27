package com.example.suketurastogi.tourguideapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class LocationAdapter extends ArrayAdapter<Location> {


    public LocationAdapter(Activity context, ArrayList<Location> words) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_list_item, parent, false);
        }

        // Get the {@link Attraction} object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name
        TextView locationName = (TextView) listItemView.findViewById(R.id.name);
        // Get the name of the attraction from the current attraction object and
        // set this text on the name attractionName
        locationName.setText(currentLocation.getName());

        // Find the TextView in the list_item.xml layout with the ID address
        TextView locationAddress = (TextView) listItemView.findViewById(R.id.address);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        locationAddress.setText(currentLocation.getAddress());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView locationImage = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            locationImage.setImageResource(currentLocation.getImageResourceId());
            // Make sure the view is visible
            locationImage.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            locationImage.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
