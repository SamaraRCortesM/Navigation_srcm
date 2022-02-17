package com.example.na_srcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class level extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
    }

    public void onClick(View view) {
        finish();
    }
}