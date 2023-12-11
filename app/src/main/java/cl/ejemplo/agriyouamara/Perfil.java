package cl.ejemplo.agriyouamara;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Perfil extends AppCompatActivity {
    TextView Nombre, Productos, Dueno;
    Button Limpiar, Guardar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Nombre = findViewById(R.id.nombreNegocio);
        Productos=findViewById(R.id.Producto);
        Dueno=findViewById(R.id.Dueno);
        Limpiar= findViewById(R.id.limpiar);
        Guardar=findViewById(R.id.Guardar);

        Guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(),PantallaPerfil.class
                );
                intent.putExtra("Nombre del negocio",Nombre.getText().toString());
                intent.putExtra("Producto/servicio ofracido",Productos.getText().toString()) ;
                intent.putExtra("Dueño del local",Dueno.getText().toString()) ;
                startActivity(intent);
            }
        });
        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Perfil.class);

                String Limpiar = " ";
                intent.putExtra("Limpiar",Limpiar.toString());
                startActivity(intent);
            }
        });
    }
}