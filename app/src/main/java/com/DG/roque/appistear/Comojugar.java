package com.DG.roque.appistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Comojugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comojugar);
        //Variable recibida desde los botones de como jugar en los juegos de retos y copa del rey
        String recibir= getIntent().getStringExtra("var");
        TextView textView = (TextView)findViewById(R.id.textView12);
        //condicional, si la cadena recibida es "corona" se mostraran las reglas de la copa del rey
        //en un TextView de la interfaz de como jugar
        if(recibir.equalsIgnoreCase("corona")){
            textView.setText(getString(R.string.copareyReglas));
        }
        else{

            ///************REGLAS DE RETOS****************
            textView.setText(getString(R.string.retosreglas));
        }
    }
}
