package com.lina.miprimeraapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Frutas extends AppCompatActivity {

    Button btnNextS;
    MediaPlayer sonidosandia;

    Button btnNextN;
    MediaPlayer sonidonaranja;

    Button btnNextP;
    MediaPlayer sonidopina;

    Button btnNextF;
    MediaPlayer sonidofresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frutas);

        btnNextS = findViewById(R.id.btnsandia);
        btnNextN = findViewById(R.id.btnnaranja);
        btnNextP = findViewById(R.id.btnpina);
        btnNextF = findViewById(R.id.btnfresa);

        btnNextS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidosandia = MediaPlayer.create(Frutas.this,R.raw.pronunciationwatermelon);
                sonidosandia.start();
                btnNextS.setText("Sandia");
            }
        });

        btnNextN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidonaranja = MediaPlayer.create(Frutas.this,R.raw.pronunciationorange);
                sonidonaranja.start();
                btnNextN.setText("Naranja");
            }
        });

        btnNextP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidopina = MediaPlayer.create(Frutas.this, R.raw.pronunciationpineapple);
                sonidopina.start();
                btnNextP.setText("Piña");
            }
        });

        btnNextF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sonidofresa = MediaPlayer.create(Frutas.this, R.raw.pronunciationstrawberry);
                sonidofresa.start();
                btnNextF.setText("fresa");
            }
        });
    }}