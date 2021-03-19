package com.example.sofia.pingpong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Multijugador extends AppCompatActivity {
    Button a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multijugador);
        getSupportActionBar().hide();
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =mispreferencias.edit();
        editor.putInt("control",0);
        int pelota = mispreferencias.getInt("pelota",0);
        a = (Button) findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Multijugador.this, uno1.class);
                startActivity(intent);
                finish();

            }
        });
        b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Multijugador.this, uno2.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
