package com.example.session4.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.session4.R;
import com.example.session4.adapter.AnswerAdapter;
import com.example.session4.model.JsonResponse;
import com.example.session4.network.ApiProvider;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv)
    RecyclerView recyclerView;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // setup recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        // get answers
        getAnswers();
    }

    private void getAnswers() {
        ApiProvider.getProvider().getAnswers("stackoverflow").enqueue(new Callback<JsonResponse>() {
            @Override
            public void onResponse(Call<JsonResponse> call, retrofit2.Response<JsonResponse> response) {
                recyclerView.setAdapter(new AnswerAdapter(response.body().getItems()));
            }

            @Override
            public void onFailure(Call<JsonResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: Failed");
            }
        });
    }


}
