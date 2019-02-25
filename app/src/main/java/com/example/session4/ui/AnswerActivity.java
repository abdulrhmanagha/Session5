package com.example.session4.ui;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.session4.R;
import com.example.session4.model.JsonResponse;
import com.example.session4.network.ApiProvider;

public class AnswerActivity extends AppCompatActivity {

    @BindView(R.id.imageView)
    ImageView imageView;

    @BindView(R.id.name)
    TextView name;

    @BindView(R.id.user_type)
    TextView user_type;

    @BindView(R.id.is_accepted)
    TextView is_accepted;

    @BindView(R.id.user_id)
    TextView user_id;

    @BindView(R.id.score)
    TextView score;

    private static final String TAG = "AnswerActivity";
    int id ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        ButterKnife.bind(this);

        id = getIntent().getIntExtra("id",0);
        Log.d(TAG, "onCreate: "+id);

        // get answer
        getAnswer();
    }

    private void getAnswer() {
        ApiProvider.getProvider().getAnswer(id, "stackoverflow").enqueue(new Callback<JsonResponse>() {
            @Override
            public void onResponse(Call<JsonResponse> call, Response<JsonResponse> response) {
                name.setText(response.body().getItems().get(0).getOwner().getDisplayName());
                score.setText(String.valueOf(response.body().getItems().get(0).getScore()));
            }

            @Override
            public void onFailure(Call<JsonResponse> call, Throwable t) {

            }
        });
    }
}
