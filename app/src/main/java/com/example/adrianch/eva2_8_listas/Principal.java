package com.example.adrianch.eva2_8_listas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    Button btnAccion;
    TextView txtVwTexto;

    Intent pedirDatos;

    final int misDatos = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnAccion = (Button) findViewById(R.id.btnAccion);
        txtVwTexto = (TextView) findViewById(R.id.txtVwTexto);
        pedirDatos = new Intent(this, Secundaria.class);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode== misDatos){
            if(resultCode==Principal.RESULT_OK){
                String cadena = data.getStringExtra("datos");
                txtVwTexto.setText(cadena);
            }
        }
    }

    public void enClick(View view) {
        startActivityForResult(pedirDatos, misDatos);
    }
}