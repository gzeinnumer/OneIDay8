package com.gzeinnumer.oneiday8.data;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private MyApiEndPointInterface API;

    public RetrofitInstance(){
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MyApiEndPointInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        retrofit.create(MyApiEndPointInterface.class);
        API = retrofit.create(MyApiEndPointInterface.class);
    }

    public MyApiEndPointInterface getAPI(){
        return API;
    }

}
