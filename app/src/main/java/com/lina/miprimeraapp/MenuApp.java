package com.lina.miprimeraapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MenuApp extends AppCompatActivity {
    // DECLARANDO BOTONES
    Button btnNextF;
    Button btnNextA;
    Button btnNextC;
    Button btnHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);

        btnNextA = findViewById(R.id.btnAnimales);
        btnNextC = findViewById(R.id.btnColores);
        btnNextF = findViewById(R.id.btnFrutas);
        btnHome = findViewById(R.id.btnHome);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irhome = new Intent(MenuApp.this,MainActivity.class);
                startActivity(irhome);
            }
        });
        btnNextF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irfrutas = new Intent(MenuApp.this, Frutas.class);
                startActivity(irfrutas);
            }
        });
        btnNextC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ircolores = new Intent(MenuApp.this,Colores.class);
                startActivity(ircolores);
            }
        });
        btnNextA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iranimales = new Intent(MenuApp.this, Animales.class);
                startActivity(iranimales);
            }
        });



        };
}
