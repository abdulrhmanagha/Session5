package com.example.session4.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://api.stackexchange.com/2.2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return  retrofit;
    }

}
