package com.stevensiahaan.halakhita.trackingapp;

/**
 * Created by HALAKHITA on 20/04/2016.
 */
public class DepartureModel {

    private String longitude;
    private String latitude;

    public DepartureModel(String longitude, String latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}
