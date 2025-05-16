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
    MediaPlayer sonidovaca;

    Button btnNextGS;
    MediaPlayer sonidogato;

    Button btnNextDS;
    MediaPlayer sonidoperro;

    Button btnNextTS;
    MediaPlayer sonidotortuga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animales);

        btnNextCS = findViewById(R.id.btncow);

        btnNextGS = findViewById(R.id.btncat);

        btnNextDS = findViewById(R.id.btndog);



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

