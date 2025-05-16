package com.lina.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

public class Preguntatres extends AppCompatActivity {
    MediaPlayer sonidoverde;
    ImageView imgverde;


    ImageView imgrojo;
    MediaPlayer sonidorojo;

    ImageView imgrosa;
    MediaPlayer sonidorosa;

    ImageView imgamarillo;
    MediaPlayer sonidoamarilo;

    Button btnNextpre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_preguntatres);

        imgverde= findViewById(R.id.verde);
        imgrojo = findViewById(R.id.rojo);
        imgrosa = findViewById(R.id.rosita);
        imgamarillo = findViewById(R.id.amarilla);
        btnNextpre = findViewById(R.id.btnpregunta3);
        btnNextpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irpagina3 =new Intent(Preguntatres.this, Preguntacuatro.class);
                startActivity(irpagina3);
            }
        });


        imgverde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoverde = MediaPlayer.create(Preguntatres.this,R.raw.ganastesound);
                sonidoverde .start();
                Intent irp =new Intent(Preguntatres.this, Preguntacuatro.class);
                startActivity(irp);

            }
        });

        imgrojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidorojo = MediaPlayer.create(Preguntatres.this, R.raw.perdistesound);
                sonidorojo.start();
            }
        });

        imgrosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidorosa = MediaPlayer.create(Preguntatres.this, R.raw.perdistesound);
                sonidorosa.start();
            }
        });

        imgamarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoamarilo= MediaPlayer.create(Preguntatres.this, R.raw.perdistesound);
                sonidoamarilo.start();

            }
        });


    }
}