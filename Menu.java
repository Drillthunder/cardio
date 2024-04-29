package com.example.cardioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Encuentra el botón por su ID y establece un click listener para el botón
        Button btn = (Button) findViewById(R.id.botonRegi);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la nueva actividad Registro
                Intent intent = new Intent(Menu.this, Registro.class);
                startActivity(intent);
            }
        });

        // Encuentra el segundo botón por su ID y establece un click listener para el botón
        Button btn1 = (Button) findViewById(R.id.botonTable);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la nueva actividad Tabla
                Intent intent = new Intent(Menu.this, Tabla.class);
                startActivity(intent);
            }
        });

        // Encuentra el tercer botón por su ID y establece un click listener para el botón
        Button btn2 = (Button) findViewById(R.id.botonPorcentaje);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un Intent para iniciar la nueva actividad Test
                Intent intent = new Intent(Menu.this, Test.class);
                startActivity(intent);
            }
        });
    }


    public void abrirMarcador(String num) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + num));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            // Manejar la situación donde no hay una aplicación de teléfono disponible
            Toast.makeText(this, "No hay una aplicación disponible para realizar llamadas.", Toast.LENGTH_SHORT).show();
        }
    }

    public void manejarBotonLlamar(View v) {
        abrirMarcador("911"); // Aquí colocas el número a marcar
    }

}