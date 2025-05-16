package com.lina.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class Salir extends AppCompatActivity {
     Button btnsalira;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_salir);

        btnsalira = findViewById(R.id.btnsalir);
        btnsalira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Salir.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}