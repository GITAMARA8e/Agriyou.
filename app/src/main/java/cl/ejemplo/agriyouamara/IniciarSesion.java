package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IniciarSesion extends AppCompatActivity {
        EditText nombre, telefono;
        Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        nombre = findViewById(R.id.nombre);
        telefono = findViewById(R.id.telefono);
        ingresar = findViewById(R.id.ingresar);

        String nom = nombre.getText().toString().trim();
        String tel = telefono.getText().toString().trim();


        if (nom.isEmpty() || tel.isEmpty()){
            nombre.setError("Campo vacio, porfavor llenar");
            telefono.setError("Campo vacio, porfavor llenar");

        } else {
            // continua
            //...
        }

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PaginaInicio.class);
                startActivity(intent);
            }
        });
    }
}