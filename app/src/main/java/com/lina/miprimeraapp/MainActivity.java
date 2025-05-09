package com.lina.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.btnSiguiente);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
               public void onClick(View view) {
                Intent menu = new Intent(MainActivity.this, seleccionprincipal.class);
                startActivity(menu);
            }
        });
    }
}