package com.gzeinnumer.oneiday8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import com.gzeinnumer.oneiday8.model.ResponseUserItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private UserVM vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vm = new ViewModelProvider(this).get(UserVM.class);

        //https://jsonplaceholder.typicode.com/posts
        vm.getRetrofitInstance()
                .getAPI()
                .getUsers()
                .enqueue(new Callback<List<ResponseUserItem>>() {
                    @Override
                    public void onResponse(Call<List<ResponseUserItem>> call, Response<List<ResponseUserItem>> response) {
                        Log.d("Zeintext", "onResponse: "+response.body().size());
                        Log.d("Zeintext", "onResponse: "+response.body().get(0).getBody());

                    }

                    @Override
                    public void onFailure(Call<List<ResponseUserItem>> call, Throwable t) {

                    }
                });
    }
}