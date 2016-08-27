package com.example.suketurastogi.tourguideapp;


public class Location {

    private String mName;
    private String mAddress;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Location(String name, String address, int imageResourceId) {
        mName=name;
        mAddress=address;
        mImageResourceId=imageResourceId;
    }

    public Location(String name, String address){
        mName=name;
        mAddress=address;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
