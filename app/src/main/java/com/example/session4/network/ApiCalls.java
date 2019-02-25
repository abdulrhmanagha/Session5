package com.example.session4.network;

import com.example.session4.model.JsonResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiCalls {

    @GET("answers")
    Call<JsonResponse> getAnswers(@Query("site") String site);

    @GET("answers/{id}")
    Call<JsonResponse> getAnswer(@Path("id") int id,
                                 @Query("site") String site);
    
}
