package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaContacto extends AppCompatActivity {
    TextView Telefono, Correo;
    Button Editar, volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_contacto);

        Telefono = findViewById(R.id.TelefonoView);
        Correo = findViewById(R.id.CorreoView);
        Editar= findViewById(R.id.Editar);
        volver= findViewById(R.id.volver7);

        String numero = getIntent().getStringExtra("Telefono/Whatsapp");
        String correo = getIntent().getStringExtra("Correo");
        Telefono.setText(numero);
        Correo.setText(correo);

        Editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Contacto.class) ;
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
