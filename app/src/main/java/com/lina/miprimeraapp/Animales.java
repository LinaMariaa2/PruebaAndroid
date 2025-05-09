package com.lina.miprimeraapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Animales extends AppCompatActivity {
    Button btnNextCS;
    ImageView imgCow;
    MediaPlayer sonidovaca;

    Button btnNextGS;
    ImageView imgcat;
    MediaPlayer sonidogato;

    Button btnNextDS;
    ImageView imgDog;
    MediaPlayer sonidoperro;

    Button btnNextTS;
    MediaPlayer sonidotortuga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animales);

        btnNextCS = findViewById(R.id.btncow);
        imgCow = findViewById(R.id.imgcow);
        btnNextGS = findViewById(R.id.btncat);
        imgcat = findViewById(R.id.imgcat);
        btnNextDS = findViewById(R.id.btndog);
        imgDog = findViewById(R.id.imgdog);
        btnNextTS = findViewById(R.id.btnturtle);

        btnNextTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidotortuga = MediaPlayer.create(Animales.this,R.raw.pronunciationturtle);
                sonidotortuga.start();
                btnNextTS.setText("TOURTLE");
            }
        });

        btnNextDS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoperro = MediaPlayer.create(Animales.this,R.raw.pronunciationdog);
                sonidoperro.start();
                btnNextDS.setText("DOG");
            }
        });

        btnNextGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidogato = MediaPlayer.create(Animales.this, R.raw.pronunciationcat);
                sonidogato.start();
                btnNextGS.setText("CAT");
            }
        });

        btnNextCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidovaca = MediaPlayer.create(Animales.this, R.raw.pronunciationcow);
                sonidovaca.start();
                btnNextCS.setText("COW");
            }
        });
    }}

