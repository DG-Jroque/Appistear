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
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        Button btretos = (Button)findViewById(R.id.btretos);
        btretos.setTypeface(nf);
        btretos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Juegos.this, OpRetos.class);
                intent.putExtra("arr", listajugadores);
                startActivity(intent);
            }
        });

        Button btcorona=(Button)findViewById(R.id.btcorona);
        btcorona.setTypeface(nf);
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
