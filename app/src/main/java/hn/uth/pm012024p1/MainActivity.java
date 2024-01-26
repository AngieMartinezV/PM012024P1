package hn.uth.pm012024p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Configuracion.SQLiteConexion;
import Configuracion.Transacciones;

public class MainActivity extends AppCompatActivity {

    EditText nombres,apellidos,telefono;
    Button btnproceso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombres = (EditText) findViewById(R.id.nombres);
        apellidos = (EditText) findViewById(R.id.apellidos);
        telefono = (EditText) findViewById(R.id.telefono);
        btnproceso = (Button) findViewById(R.id.btnproceso);

        btnproceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ActivityPage.class);

                String nomb = nombres.getText().toString();
                String apell = apellidos.getText().toString();
                String telef = telefono.getText().toString();

                intent.putExtra("Nombre:",nomb);
                intent.putExtra("Apellido:",apell);
                intent.putExtra("Telefono:",telef);
                startActivity(intent);
            Addperson();
            }
        });
    }

    private void Addperson() {
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.DBName,null, 1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombres, nombres.getText().toString());
    }

}