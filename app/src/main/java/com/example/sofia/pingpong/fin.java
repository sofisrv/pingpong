package com.example.sofia.pingpong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class fin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fin);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",0);
                editor.commit();
                Intent intent = new Intent(fin.this, pantallaprincipal.class);
                startActivity(intent);
            }
        }, 4000);
    }
}
