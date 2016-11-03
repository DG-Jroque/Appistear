package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Juegos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegos);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        Button btretos = (Button)findViewById(R.id.btretos);
        btretos.setTypeface(nf);
        btretos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Juegos.this, RetosJugadores.class);
                startActivity(intent);
            }
        });

        Button btcorona=(Button)findViewById(R.id.btcorona);
        btcorona.setTypeface(nf);
        btcorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Juegos.this,CoronaRey.class);
                startActivity(intent);
            }
        });
    }

}
