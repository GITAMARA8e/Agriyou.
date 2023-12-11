package cl.ejemplo.agriyouamara;

import android.app.DirectAction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaInicio extends AppCompatActivity {
    ImageButton Perfil,Contacto, Mapa;
    Button CerrarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_inicio);

        Perfil = findViewById(R.id.Perfil);
        Mapa= findViewById(R.id.Mapa);
        Contacto = findViewById(R.id.Contacto);
        CerrarSesion=findViewById(R.id.CerrarSesion);

        Perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Perfil.class);
                startActivity(intent);
            }
        });
        Mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), mapa.class);
                startActivity(intent);
            }
        });
        Contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Contacto.class);
                startActivity(intent);
            }
        });
        CerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}