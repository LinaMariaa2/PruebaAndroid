package com.lina.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Preguntauno extends AppCompatActivity {

    MediaPlayer sonidobiengatito;
    ImageView imggatito;

    ImageView imgvaquita;

    MediaPlayer sonidomalvaquita;

    ImageView imgdog;

    MediaPlayer sonidomaldog;

    ImageView imgtortuguita;
    MediaPlayer sonidotortuga;



    Button btnNextQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_preguntauno);

        imggatito = findViewById(R.id.imgcat);
        imgvaquita = findViewById(R.id.imgcow);
        imgdog = findViewById(R.id.imgdogs);
        imgtortuguita = findViewById(R.id.imgtourtle);
        btnNextQ = findViewById(R.id.btnpregunta1);

        btnNextQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Preguntauno.this, Preguntados.class);
                startActivity(intent);
            }
        });

        imgtortuguita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidotortuga = MediaPlayer.create(Preguntauno.this,R.raw.ganastesound);
                sonidotortuga.start();
                Intent irp =new Intent(Preguntauno.this, Preguntados.class);
                startActivity(irp);
            }

        });


        imgdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidomaldog = MediaPlayer.create(Preguntauno.this, R.raw.perdistesound);
                sonidomaldog.start();
            }
        });

        imgvaquita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidomalvaquita = MediaPlayer.create(Preguntauno.this, R.raw.perdistesound);
                sonidomalvaquita.start();
            }
        });

        imggatito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidobiengatito = MediaPlayer.create(Preguntauno.this, R.raw.perdistesound);
                sonidobiengatito.start();

            }
        });


    }
}