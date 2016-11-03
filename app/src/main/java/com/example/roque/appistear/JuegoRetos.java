package com.example.roque.appistear;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class JuegoRetos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_retos);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        Button btnretos=(Button)findViewById(R.id.btnsigret);
        btnretos.setTypeface(nf);
        btnretos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv=(TextView)findViewById(R.id.reto);
                tv.setVisibility(View.VISIBLE);
                ArrayList<String> listajugadores = (ArrayList<String>) getIntent().getStringArrayListExtra("arr");
                String[] retos=getResources().getStringArray(R.array.retos);
                int tam=listajugadores.size();
                int tamret=retos.length;
                final Random rnd= new Random();
                int nj=rnd.nextInt(tam)+1;
                int nr=rnd.nextInt(tamret)+1;
                tv.setText(listajugadores.get(nj-1).toUpperCase().toString() +", " +retos[nr-1].toUpperCase().toString());

            }
        });
    }

}