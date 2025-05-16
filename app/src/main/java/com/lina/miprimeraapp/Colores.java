package com.lina.miprimeraapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Colores extends AppCompatActivity {

    Button btnNextP;
    MediaPlayer sonidorosado;

    Button btnNextY;
    MediaPlayer sonidoamarillo;

    Button btnNextG;
    MediaPlayer sonidogreen;

    Button btnNextR;
    MediaPlayer sonidorojo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_colores);

        btnNextP = findViewById(R.id.pink);
        btnNextY = findViewById(R.id.yellow);
        btnNextG = findViewById(R.id.green);
        btnNextR = findViewById(R.id.red);

        btnNextP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidorosado = MediaPlayer.create(Colores.this,R.raw.pronunciationpink);
                sonidorosado.start();
                btnNextP.setText("Rosado");
            }
        });

        btnNextY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoamarillo = MediaPlayer.create(Colores.this,R.raw.pronunciationyellow);
                sonidoamarillo.start();
                btnNextY.setText("Amarillo");
            }
        });

        btnNextG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidogreen = MediaPlayer.create(Colores.this, R.raw.pronunciationgreen);
                sonidogreen.start();
                btnNextP.setText("Verde");
            }
        });

        btnNextR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidorojo = MediaPlayer.create(Colores.this, R.raw.pronunciationred);
                sonidorojo.start();
                btnNextR.setText("Rojo");
            }
        });
    }}