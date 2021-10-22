package com.gzeinnumer.oneiday8.data;

import com.gzeinnumer.oneiday8.model.ResponseUserItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApiEndPointInterface {

    // Trailing slash is needed
    String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @GET("/posts")
    Call<List<ResponseUserItem>> getUsers();

}
