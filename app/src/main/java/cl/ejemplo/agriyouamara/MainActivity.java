package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button Registrar;
    Button iniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registrar = findViewById(R.id.Registrar);
        iniciarSesion = findViewById(R.id.iniciarSesion);


        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent
                        (getApplicationContext(),
                                Registrar.class);
                startActivity(intent);

            }
        });
        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IniciarSesion.class);
                startActivity(intent);
            }

        });


    }


}