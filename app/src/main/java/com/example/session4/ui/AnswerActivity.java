package com.example.session4.ui;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.session4.R;

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

    private int answer_id ;
    private static final String SITE = "stackoverflow";
    private static final String TAG = "AnswerActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        ButterKnife.bind(this);
    }
}
