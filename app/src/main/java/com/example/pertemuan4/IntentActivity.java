package com.example.pertemuan4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class IntentActivity extends AppCompatActivity {
    private TextView tvTitle, tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
        tvTitle = findViewById(R.id.tvTitle);
        tvDesc = findViewById(R.id.tvDesc);

        String title = getIntent().getStringExtra("title");
        String desc = getIntent().getStringExtra("desc");

        tvTitle.setText(title);
        tvDesc.setText(desc);
    }
}
