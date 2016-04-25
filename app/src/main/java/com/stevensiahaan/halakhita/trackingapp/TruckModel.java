package com.stevensiahaan.halakhita.trackingapp;

import java.util.List;

/**
 * Created by HALAKHITA on 20/04/2016.
 */
public class TruckModel {

    private String truck;
    private DepartureModel departure ;
    private String license;
    private String name;

    public TruckModel(String truck, DepartureModel departure, String license, String name) {
        this.truck = truck;
        this.departure = departure;
        this.license = license;
        this.name = name;
    }

    public String getTruck() {
        return truck;
    }

    public void setTruck(String truck) {
        this.truck = truck;
    }

    public DepartureModel getDeparture() {
        return departure;
    }

    public void setDeparture(DepartureModel departure) {
        this.departure = departure;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
