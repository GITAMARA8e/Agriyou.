package cl.ejemplo.agriyouamara;

import androidx.annotation.NonNull;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class Registrar extends AppCompatActivity {
    EditText Nombre,Nacimiento,Telefono,Correo;
    Button Registrar2, comprador, vendedor;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @SuppressLint("MissingInflatedId")
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Nombre = findViewById(R.id.Nombre);
        Nacimiento = findViewById(R.id.Nacimiento);
        Telefono = findViewById(R.id.Telefono);
        Correo = findViewById(R.id.Correo);
        Registrar2 = findViewById(R.id.Registrar2);
        comprador=findViewById(R.id.BtnComprador);
        vendedor=findViewById(R.id.BtnVendedor);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        String Nom = Nombre.getText().toString().trim();
        String nac = Nacimiento.getText().toString().trim();
        String tel = Telefono.getText().toString().trim();

        if (Nom.isEmpty() || nac.isEmpty() || tel.isEmpty()){
            Nombre.setError("Campo vacio, porfavor llenar");
            Nacimiento.setError("Campo vacio, porfavor llenar");
            Telefono.setError("Campo vacio, porfavor llenar");
        } else {
            // continua
            //...
        }
        Registrar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Firebase();
            }
                private void Firebase() {
                    databaseReference.child("Nombre").setValue(Nombre.getText().toString());
                    databaseReference.child("Nacimiento").setValue(Nacimiento.getText().toString());
                    databaseReference.child("Telefono").setValue(Telefono.getText().toString());
                    databaseReference.child("Correo").setValue(Correo.getText().toString());
                    Toast.makeText(getApplicationContext(),"Registro completado",Toast.LENGTH_LONG).show();
                }
        });
        vendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),PaginaInicio.class);
                startActivity(intent);
            }
        });
        comprador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MapaComprador.class);
                startActivity(intent);
            }
        });


    }
}
