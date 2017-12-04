package com.example.adrianch.eva2_8_listas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Secundaria extends AppCompatActivity implements ListView.OnItemClickListener {

    ListView lstVwDatos;

    Intent intentoDatos;

    String[] arregloDatos = {"Tacos", "Tortas", "Montado", "Hotdog",
            "Hamburguesa", "Pay", "Suchi", "Bolas de arroz", "Burros",
            "Ceviche", "Discada", "Flautas", "Enchiladas", "asd", "xsdasd"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        lstVwDatos = (ListView) findViewById(R.id.lstVwDatos);
        lstVwDatos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arregloDatos));
        intentoDatos = getIntent();
        lstVwDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        intentoDatos.putExtra("datos", arregloDatos[i]);
        setResult(Activity.RESULT_OK, intentoDatos);
        finish();
    }
}
