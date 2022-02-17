package com.example.na_srcm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void onClick(View view) {
        Intent miIntent=null;

        switch (view.getId()){
            case R.id.next:
                miIntent=new Intent(Next.this,MainActivity.class);
                break;


            case R.id.level:
                miIntent=new Intent(Next.this,level.class);
                break;

        }

        startActivity(miIntent);
    }
}