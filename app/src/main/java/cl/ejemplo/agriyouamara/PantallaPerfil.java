package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaPerfil extends AppCompatActivity {
    TextView NombreD, Productos, NombreN;
    Button Editar, volver;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_perfil);

        NombreD = findViewById(R.id.NombreDuenoView);
        NombreN= findViewById(R.id.NombreNegocioView);
        Productos= findViewById(R.id.ProductosView);
        Editar= findViewById(R.id.Editar);
        volver= findViewById(R.id.volver3);

        String nombred = getIntent().getStringExtra("Nombre del dueño");
        String nombren = getIntent().getStringExtra("Nombre del negocio");
        String producto = getIntent().getStringExtra("Productos/servicios que ofrece");
        NombreD.setText(nombred);
        NombreN.setText(nombren);
        Productos.setText(producto);

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