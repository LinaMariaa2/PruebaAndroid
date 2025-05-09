package com.lina.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class seleccionprincipal extends AppCompatActivity {

    Button btnNextJugar;
    Button btnNextAprender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seleccionprincipal);

        btnNextAprender = findViewById(R.id.btnaprender);
        btnNextJugar = findViewById(R.id.btnjugar);

        btnNextJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irJugar = new Intent(seleccionprincipal.this,MenuApp.class);
                startActivity(irJugar);
            }
        });

        btnNextAprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAprender = new Intent(seleccionprincipal.this, MenuApp.class);
                startActivity(irAprender);
            }
        });
    }
}