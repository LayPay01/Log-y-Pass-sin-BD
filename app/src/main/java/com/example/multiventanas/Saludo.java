package com.example.multiventanas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    private TextView SaludoM;
    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        SaludoM = findViewById(R.id.SaludoM);
        datos = getIntent().getExtras();
        SaludoM.setText(datos.getString("Nombre"));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void salir(View view){
        Intent siguiente = new Intent(Saludo.this, Salida.class);
        startActivity(siguiente);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}