package com.example.ejerccicio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivityhome extends AppCompatActivity {
    private TextView txtMostrar;
    String codigo2, categoria2,nombre2,moneda2,trabado2;
    String cantidad2;
    String precio2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityhome);
        inicializarvistas();
        obtenerdatosprimerapantalla();
        mostrardatos();
    }

    private void mostrardatos() {
        txtMostrar.setText(codigo2+ "\n" + categoria2 +"\n" + nombre2 +"\n" + cantidad2 +"\n" + precio2 +
                "\n" + moneda2+"\n" + trabado2);
    }

    private void obtenerdatosprimerapantalla() {
        codigo2 = this.getIntent().getExtras().getString("codigo_prod","");
        categoria2 = this.getIntent().getExtras().getString("categoria_prod","");
        nombre2 = this.getIntent().getExtras().getString("nombre_prod", "");
        moneda2 = this.getIntent().getExtras().getString("moneda_prod", "");
        trabado2 = this.getIntent().getExtras().getString("trabado_prod", "");
        cantidad2 = this.getIntent().getExtras().getString("cantidad_prod", "");
        precio2 = this.getIntent().getExtras().getString("precio_prod", "");


    }

    private void inicializarvistas() {
        txtMostrar = findViewById(R.id.txtMostrar);
    }
}