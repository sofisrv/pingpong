package com.example.sofia.pingpong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class velocidades extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.velocidades);
        getSupportActionBar().hide();
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("velocidad",30);
                editor.commit();
                Intent intent = new Intent(velocidades.this, Multijugador.class);
                startActivity(intent);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("velocidad",20);
                editor.commit();
                Intent intent = new Intent(velocidades.this, Multijugador.class);
                startActivity(intent);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("velocidad",10);
                editor.commit();
                Intent intent = new Intent(velocidades.this, Multijugador.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
