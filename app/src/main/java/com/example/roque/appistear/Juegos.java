package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Juegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
        final ArrayList<String> listajugadores = (ArrayList<String>) getIntent().getStringArrayListExtra("arr");
        //guardar tipografía en una variable
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //Crear el boton de retos y asignarle la tipografía
        Button btretos = (Button)findViewById(R.id.btretos);
        btretos.setTypeface(nf);
        //función al dar clic en el boton de retos enviando el arreglo de jugadores
        btretos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Juegos.this, OpRetos.class);
                intent.putExtra("arr", listajugadores);
                startActivity(intent);
            }
        });
        //Crear el boton de copa del rey y asignarle la tipografía
        Button btcorona=(Button)findViewById(R.id.btcorona);
        btcorona.setTypeface(nf);
        //función al dar clic en el boton de copa del rey enviando el arreglo de jugadores
        btcorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Juegos.this,OpCorona.class);
                intent.putExtra("arr", listajugadores);
                startActivity(intent);
            }
        });
    }

}
