package com.stevensiahaan.halakhita.trackingapp;

/**
 * Created by HALAKHITA on 20/04/2016.
 */
public class Respon {
    private String error;
    private TruckModel hasil;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public TruckModel getHasil() {
        return hasil;
    }

    public void setHasil(TruckModel hasil) {
        this.hasil = hasil;
    }
}
