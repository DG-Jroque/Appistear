package com.example.roque.appistear;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");

        final Button boton = (Button)findViewById(R.id.juegos);
        boton.setTypeface(nf);
//Implementamos el evento “click” del botón
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Juegos.class);
                startActivity(intent);
            }
        });

        final Button btn = (Button)findViewById(R.id.cocteleria);
        btn.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Cocteleria.class);
                startActivity(intent);
            }
        });

        final Button bt = (Button)findViewById(R.id.opciones);
        bt.setTypeface(nf);
//Implementamos el evento “click” del botón
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Opciones.class);
                startActivity(intent);
            }
        });

    }
}
