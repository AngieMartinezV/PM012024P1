package hn.uth.pm012024p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class ActivityPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        Intent intent = getIntent();
        String nomb = intent.getStringExtra("Nombre:");
        String apell = intent.getStringExtra("Apellido:");
        String telef = intent.getStringExtra("Telefono:");

        TextView textView = findViewById(R.id.textView3);

        textView.setText("Nombre: "+nomb+"\n\nApellido: "+apell+"\n\nTelefono: "+telef);

    }
}