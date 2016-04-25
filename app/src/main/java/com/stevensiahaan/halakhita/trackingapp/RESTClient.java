package com.stevensiahaan.halakhita.trackingapp;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HALAKHITA on 20/04/2016.
 */
public class RESTClient {

    public static RestInterface REST_CLIENT;
    public static String URL = "http://beta.json-generator.com/api/json/";


    static {
        setRestClient();
    }

    private RESTClient(){}
    public static RestInterface getRestClient(){return REST_CLIENT; }

    private static void setRestClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .client(new OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        REST_CLIENT = retrofit.create(RestInterface.class);
    }
}
