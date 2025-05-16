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

public class Preguntacuatro extends AppCompatActivity {


    MediaPlayer sonidogato;
    ImageView imggato;

    ImageView imgvaca;

    MediaPlayer sonidovaca;

    ImageView imgdog;

    MediaPlayer sonidomaldog;

    ImageView imgtortuguita;
    MediaPlayer sonidotortuga;



    Button btnNextQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_preguntacuatro);

        imggato = findViewById(R.id.imgcat);
        imgvaca = findViewById(R.id.imgcow);
        imgdog = findViewById(R.id.imgdogs);
        imgtortuguita = findViewById(R.id.imgtourtle);
        btnNextQ = findViewById(R.id.btnpregunta4);

        btnNextQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Preguntacuatro.this, Salir.class);
                startActivity(intent);
            }
        });

        imgtortuguita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidotortuga = MediaPlayer.create(Preguntacuatro.this,R.raw.perdistesound);
                sonidotortuga.start();
            }

        });


        imgdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidomaldog = MediaPlayer.create(Preguntacuatro.this, R.raw.perdistesound);
                sonidomaldog.start();
            }
        });

        imgvaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidovaca = MediaPlayer.create(Preguntacuatro.this, R.raw.ganastesound);
                sonidovaca.start();
                Intent irp =new Intent(Preguntacuatro.this, Salir.class);
                startActivity(irp);
            }
        });

        imggato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidogato = MediaPlayer.create(Preguntacuatro.this, R.raw.perdistesound);
                sonidogato.start();

            }
        });


    }
}