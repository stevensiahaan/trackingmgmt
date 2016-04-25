package com.stevensiahaan.halakhita.trackingapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by HALAKHITA on 20/04/2016.
 */
public interface RestInterface {

    @GET("shopping?callname=FindPopularItems&responseencoding=JSON&appid=FandyGot-ec13-4906-b11c-94d9e36684ee&siteid=0&QueryKeywords=dog&version=713")
    Call<List<TruckModel>> getHasil();

}
