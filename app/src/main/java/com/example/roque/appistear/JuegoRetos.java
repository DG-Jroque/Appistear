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
        String j="";
        setContentView(R.layout.activity_juego_retos);
        TextView tv=(TextView)findViewById(R.id.reto);
        ArrayList<String> listajugadores = (ArrayList<String>) getIntent().getStringArrayListExtra("arr");
        ArrayList<String>retos=new ArrayList<String>();
        int tam=listajugadores.size();
        int tamret=getResources().getStringArray(R.array.retos).length;

        tv.setText(String.valueOf(tam) +" " +String.valueOf(tamret));
    }
}
