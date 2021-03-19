package com.example.sofia.pingpong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class eligepelota extends AppCompatActivity {
    ImageButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eligepelota);
        getSupportActionBar().hide();

        b1 = (ImageButton) findViewById(R.id.b1);
        b2 = (ImageButton) findViewById(R.id.b2);
        b3 = (ImageButton) findViewById(R.id.b3);
        b4 = (ImageButton) findViewById(R.id.b4);
        b5 = (ImageButton) findViewById(R.id.b5);
        b6 = (ImageButton) findViewById(R.id.b6);
        b7 = (ImageButton) findViewById(R.id.b7);
        b8 = (ImageButton) findViewById(R.id.b8);
        b9 = (ImageButton) findViewById(R.id.b9);
        b10 = (ImageButton) findViewById(R.id.b10);
        b11 = (ImageButton) findViewById(R.id.b11);
        b12 = (ImageButton) findViewById(R.id.b12);
        b13 = (ImageButton) findViewById(R.id.b13);
        b14 = (ImageButton) findViewById(R.id.b14);
        b15 = (ImageButton) findViewById(R.id.b15);
        b16 = (ImageButton) findViewById(R.id.b16);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",1);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",2);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",3);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",4);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",5);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",6);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",7);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",8);
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                editor.commit();
                startActivity(intent);
                finish();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",9);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",10);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",11);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",12);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",13);
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                editor.commit();
                startActivity(intent);
                finish();
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",14);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",15);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor =mispreferencias.edit();
                editor.putInt("pelota",16);
                editor.commit();
                Intent intent = new Intent(eligepelota.this, velocidades.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
