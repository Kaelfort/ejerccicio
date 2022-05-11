package com.example.ejerccicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etCodigo, etCategoria, etNombre, etCantidad, etPrecio, etMoneda, etTrabado;
    private Button btnRegistrar;
    String codigo, categoria,nombre,moneda,trabado;
    String cantidad;
    String precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistar();
        btnRegistrar.setOnClickListener(view -> {obtenerinformacion(); pasaraotrapantalla();});

    }

    private void pasaraotrapantalla() {
        Intent intencion = new Intent(this, MainActivityhome.class); //o MainActivity.this
        intencion.putExtra("codigo_prod",codigo );
        intencion.putExtra("categoria_prod",categoria );
        intencion.putExtra("nombre_prod", nombre);
        intencion.putExtra("cantidad_prod",cantidad );
        intencion.putExtra("precio_prod",precio );
        intencion.putExtra("moneda_prod",moneda );


        intencion.putExtra("trabado_prod",trabado );

        startActivity(intencion);

    }
    private void obtenerinformacion() {
        codigo=etCodigo.getText().toString();
        categoria=etCategoria.getText().toString();
        nombre=etNombre.getText().toString();
        cantidad=etCantidad.getText().toString();
        precio=etPrecio.getText().toString();
        moneda=etMoneda.getText().toString();
        trabado=etTrabado.getText().toString();


    }


    private void inicializarVistar() {
        etCodigo =findViewById(R.id.etCodProducto);
        etCategoria = findViewById(R.id.etCategoriaProd);
        etNombre = findViewById(R.id.etNombreProd);
        etCantidad = findViewById(R.id.etCantidad);
        etPrecio = findViewById(R.id.etPrecio);
        etMoneda = findViewById(R.id.etMonedaoBillete);
        etTrabado = findViewById(R.id.etTrabado);
        btnRegistrar = findViewById(R.id.btnRegistrar);
    }
}