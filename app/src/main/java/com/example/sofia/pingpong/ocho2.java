package com.example.sofia.pingpong;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ocho2 extends AppCompatActivity {
    ImageView pel;
    Button uno,dos,tres,cuatro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conpelota);
        getSupportActionBar().hide();
        pel = (ImageView) findViewById(R.id.pelota);

        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);

        uno.setBackgroundColor(Color.WHITE);
        dos.setBackgroundColor(Color.WHITE);
        tres.setBackgroundColor(Color.WHITE);
        cuatro.setBackgroundColor(Color.GRAY);

        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(true);
        cuatro.setEnabled(true);

        uno.setVisibility(View.INVISIBLE);
        dos.setVisibility(View.INVISIBLE);
        tres.setVisibility(View.VISIBLE);
        cuatro.setVisibility(View.VISIBLE);

        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        int pelota = mispreferencias.getInt("pelota",0);
        if(pelota==1){
            pel.setImageResource(R.mipmap.p1);
        }
        if(pelota==2){
            pel.setImageResource(R.mipmap.p2);
        }
        if(pelota==3){
            pel.setImageResource(R.mipmap.p3);
        }
        if(pelota==4){
            pel.setImageResource(R.mipmap.p4);
        }
        if(pelota==5){
            pel.setImageResource(R.mipmap.p5);
        }
        if(pelota==6){
            pel.setImageResource(R.mipmap.p6);
        }
        if(pelota==7){
            pel.setImageResource(R.mipmap.p7);
        }
        if(pelota==8){
            pel.setImageResource(R.mipmap.p8);
        }
        if(pelota==9){
            pel.setImageResource(R.mipmap.p10);
        }
        if(pelota==10){
            pel.setImageResource(R.mipmap.p11);
        }
        if(pelota==11){
            pel.setImageResource(R.mipmap.p12);
        }
        if(pelota==12){
            pel.setImageResource(R.mipmap.p13);
        }
        if(pelota==13){
            pel.setImageResource(R.mipmap.p14);
        }
        if(pelota==14){
            pel.setImageResource(R.mipmap.p15);
        }
        if(pelota==15){
            pel.setImageResource(R.mipmap.p18);
        }
        if(pelota==16){
            pel.setImageResource(R.mipmap.p17);
        }
        int c=0;
        gcontrol(c);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uno.setBackgroundColor(Color.GRAY);
                dos.setBackgroundColor(Color.WHITE);
                tres.setBackgroundColor(Color.WHITE);
                cuatro.setBackgroundColor(Color.WHITE);

                uno.setEnabled(true);
                dos.setEnabled(true);
                tres.setEnabled(false);
                cuatro.setEnabled(false);

                uno.setVisibility(View.VISIBLE);
                dos.setVisibility(View.VISIBLE);
                tres.setVisibility(View.INVISIBLE);
                cuatro.setVisibility(View.INVISIBLE);
                int c=0;
                gcontrol(c);

            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uno.setBackgroundColor(Color.WHITE);
                dos.setBackgroundColor(Color.GRAY);
                tres.setBackgroundColor(Color.WHITE);
                cuatro.setBackgroundColor(Color.WHITE);

                uno.setEnabled(true);
                dos.setEnabled(true);
                tres.setEnabled(true);
                cuatro.setEnabled(false);

                uno.setVisibility(View.VISIBLE);
                dos.setVisibility(View.VISIBLE);
                tres.setVisibility(View.VISIBLE);
                cuatro.setVisibility(View.INVISIBLE);
                int c=1;
                gcontrol(c);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uno.setBackgroundColor(Color.WHITE);
                dos.setBackgroundColor(Color.WHITE);
                tres.setBackgroundColor(Color.GRAY);
                cuatro.setBackgroundColor(Color.WHITE);

                uno.setEnabled(false);
                dos.setEnabled(true);
                tres.setEnabled(true);
                cuatro.setEnabled(true);

                uno.setVisibility(View.INVISIBLE);
                dos.setVisibility(View.VISIBLE);
                tres.setVisibility(View.VISIBLE);
                cuatro.setVisibility(View.VISIBLE);
                int c=0;
                gcontrol(c);

            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                uno.setBackgroundColor(Color.WHITE);
                dos.setBackgroundColor(Color.WHITE);
                tres.setBackgroundColor(Color.WHITE);
                cuatro.setBackgroundColor(Color.GRAY);

                uno.setEnabled(false);
                dos.setEnabled(false);
                tres.setEnabled(true);
                cuatro.setEnabled(true);

                uno.setVisibility(View.INVISIBLE);
                dos.setVisibility(View.INVISIBLE);
                tres.setVisibility(View.VISIBLE);
                cuatro.setVisibility(View.VISIBLE);
                int c=0;
                gcontrol(c);

            }
        });
        int w = 50, x = 50;
        muevepelotaida(w, x);
    }

    public void muevepelotaida(int w, int x) {
        final int y = w;
        final int z = x;
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        int velocidad = mispreferencias.getInt("velocidad",0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pel.setTranslationX(y);
                pel.setTranslationY(z);
                if (y < 752) {
                    int v = y + 20;
                    int u = z + 20;
                    muevepelotaida(v, u);
                }
                if (y >751) {
                    int a=y, b=z;
                    muevepelotareg(y,z);
                }
            }
        }, velocidad);
    }
    public void muevepelotaida2(int w, int x) {
        final int y = w;
        final int z = x;
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        int velocidad = mispreferencias.getInt("velocidad",0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pel.setTranslationX(y);
                pel.setTranslationY(z);
                if (y > 0) {
                    int v = y - 20;
                    int u = z - 20;
                    muevepelotaida2(v, u);
                }
                if (y<20) {
                    muevepelotareg2(y,z);
                }
            }
        }, velocidad);
    }
    public void muevepelotareg(int a, int b) {
        final int d = a;
        final int e = b;
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        int velocidad = mispreferencias.getInt("velocidad",0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pel.setTranslationX(d);
                pel.setTranslationY(e);
                if (d >300) {
                    int v = d - 20;
                    int u = e + 20;
                    muevepelotareg(v, u);
                }
                if (d<=300) {
                    SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
                    int control = mispreferencias.getInt("control",0);
                    if (control==1) {
                        int x=300, y=1240;
                        muevepelotaida2(x,y);
                    }
                    else {
                        Intent intent = new Intent(ocho2.this, fin.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        }, velocidad);
    }
    public void muevepelotareg2(int a, int b) {
        final int d = a;
        final int e = b;
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        int velocidad = mispreferencias.getInt("velocidad",0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pel.setTranslationX(d);
                pel.setTranslationY(e);
                if (d <750) {
                    int v = d + 20;
                    int u = e - 20;
                    muevepelotareg2(v, u);
                }
                if (d>=750) {
                    muevepelotaida3(d,e);
                }
            }
        }, velocidad);
    }
    public void muevepelotaida3(int a, int b) {
        final int d = a;
        final int e = b;
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        int velocidad = mispreferencias.getInt("velocidad",0);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pel.setTranslationX(d);
                pel.setTranslationY(e);
                if (d >100) {
                    int v = d - 20;
                    int u = e - 20;
                    muevepelotaida3(v, u);
                }
                if (e==-100) {
                    Intent intent = new Intent(ocho2.this, uno2.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, velocidad);
    }
    public void gcontrol(int c){
        SharedPreferences mispreferencias=getSharedPreferences("status", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor =mispreferencias.edit();
        editor.putInt("control",c);
        editor.commit();
    }
}
