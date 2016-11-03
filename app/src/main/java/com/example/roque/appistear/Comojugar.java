package com.example.roque.appistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Comojugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comojugar);
        String recibir= getIntent().getStringExtra("var");
        TextView textView = (TextView)findViewById(R.id.textView12);
        if(recibir.equalsIgnoreCase("corona")){
            textView.setText(getString(R.string.copareyReglas));
        }
        else{

            ///************REGLAS DE RETOS****************
            textView.setText(getString(R.string.retosreglas));
        }
    }
}
