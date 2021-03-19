package com.example.sofia.pingpong;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tres2 extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.sinpelota);
            getSupportActionBar().hide();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(com.example.sofia.pingpong.tres2.this, cuatro2.class);
                    startActivity(intent);
                    finish();
                }
            }, 4000);
        }
    }