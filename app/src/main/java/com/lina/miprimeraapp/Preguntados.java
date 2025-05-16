package com.lina.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Preguntados extends AppCompatActivity {

    MediaPlayer sonidopina;
    ImageView imgpina;


    ImageView imgsandia;
    MediaPlayer sonidosandia;

    ImageView imgfresa;
    MediaPlayer sonidofresa;

    ImageView imgnaranja;
    MediaPlayer sonidonaranja;

    Button btnNextpre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_preguntados);

        imgpina = findViewById(R.id.pina);
        imgsandia = findViewById(R.id.sandia);
        imgfresa = findViewById(R.id.fresa);
        imgnaranja = findViewById(R.id.naranja);
        btnNextpre = findViewById(R.id.btnpregunta2);
        btnNextpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irpagina3 =new Intent(Preguntados.this, Preguntatres.class);
                startActivity(irpagina3);

            }
        });


        imgpina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidopina = MediaPlayer.create(Preguntados.this,R.raw.ganastesound);
                sonidopina.start();
                Intent irp =new Intent(Preguntados.this, Preguntatres.class);
                startActivity(irp);
            }
        });

        imgfresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidofresa = MediaPlayer.create(Preguntados.this, R.raw.perdistesound);
                sonidofresa.start();
            }
        });

        imgsandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidosandia = MediaPlayer.create(Preguntados.this, R.raw.perdistesound);
                sonidosandia.start();
            }
        });

        imgnaranja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidonaranja = MediaPlayer.create(Preguntados.this, R.raw.perdistesound);
                sonidonaranja.start();

            }
        });


    }
}