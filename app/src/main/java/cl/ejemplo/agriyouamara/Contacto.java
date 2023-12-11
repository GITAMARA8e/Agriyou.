package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contacto extends AppCompatActivity {
    TextView Telefono, Correo;
    Button Guardar, volver;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
        Telefono = findViewById(R.id.TelefonoView);
        Correo = findViewById(R.id.CorreoView);
        Guardar= findViewById(R.id.GuarCont);
        volver= findViewById(R.id.volver6);



        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PantallaContacto.class);
                intent.putExtra("Telefono/Celular",Telefono.getText().toString());
                intent.putExtra("Correo",Correo.getText().toString());
                startActivity(intent);
            }
        });
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PaginaInicio.class);
            }
        });


    }
}