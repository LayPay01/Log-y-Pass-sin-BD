package com.example.multiventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2;
    String nombre = "Juan Perez", login = "Juan", pass = "123";
    private EditText usuario, contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = findViewById(R.id.user);
        contraseña = findViewById(R.id.password);
    }
    public void validar(View view){
        Intent Saludo = new Intent(MainActivity.this, Saludo.class);
        Intent Fallo = new Intent(MainActivity.this, Error.class);
        String l = usuario.getText().toString();
        String p = contraseña.getText().toString();
        if(l.equals(login)&& p.equals(pass)){
            Saludo.putExtra("Nombre",nombre);
            startActivity(Saludo);
        }
        else{
            startActivity(Fallo);
        }
    }

    public void erase(View view){
        usuario.setText("");
        contraseña.setText("");
    }
}