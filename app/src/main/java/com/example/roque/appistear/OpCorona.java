package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class OpCorona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_corona);
        //arreglo de strings de los jugadores
        final ArrayList<String> jugadores=new ArrayList<String>();
        //crear al tipografía y guardarla en una variable
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        Button btcorona = (Button) findViewById(R.id.btncorona);
        //asignar tipografía al boton de jugar
        btcorona.setTypeface(nf);
        //evento al dar clic en el boton de jugar/play
        btcorona.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(OpCorona.this, CoronaRey.class);
                intent.putExtra("arr", jugadores);
                startActivity(intent);
            }
        });
        btcorona.setTypeface(nf);
        Button bthtp = (Button) findViewById(R.id.btnhtpc);
        bthtp.setTypeface(nf);
        //evento al dar clic en el boton de como jugar, mandando un string a la interfaaz de como jugar
        bthtp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(OpCorona.this,Comojugar.class);
                intent.putExtra("var", "corona");
                startActivity(intent);
            }
        });
        //asignar tipografía al boton de como jugar
        bthtp.setTypeface(nf);

    }
}
