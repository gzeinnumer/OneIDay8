package com.gzeinnumer.oneiday8;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;

import com.gzeinnumer.oneiday8.data.RetrofitInstance;

public class UserVM extends AndroidViewModel {

    private RetrofitInstance retrofitInstance;

    public UserVM(@NonNull Application application) {
        super(application);
        retrofitInstance = new RetrofitInstance();
    }

    public RetrofitInstance getRetrofitInstance() {
        return retrofitInstance;
    }
}