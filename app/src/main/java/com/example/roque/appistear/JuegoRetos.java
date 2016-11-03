package com.example.roque.appistear;

import android.content.res.Resources;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class JuegoRetos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_retos);
        TextView tv=(TextView)findViewById(R.id.reto);
        ArrayList<String> listajugadores = (ArrayList<String>) getIntent().getStringArrayListExtra("arr");
        String[] retos=getResources().getStringArray(R.array.retos);
        int tam=listajugadores.size();
        int tamret=retos.length;
        final Random rnd= new Random();
        int nj=rnd.nextInt(tam)+1;
        int nr=rnd.nextInt(tamret)+0;
        tv.setText(listajugadores.get(nj).toString() +" " +retos[nr].toString() +" ");
    }
}