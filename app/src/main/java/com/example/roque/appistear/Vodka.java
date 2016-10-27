package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vodka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vodka);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");


        final Button btn = (Button)findViewById(R.id.buttonWhiteRussian);
        btn.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Vodka.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Vodka_WhiteRussian");
                startActivity(intent);
            }
        });

    }
}