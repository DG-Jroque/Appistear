package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Whisky extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whisky);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");

        final TextView bttTe = (TextView) findViewById(R.id.textView);
        bttTe.setTypeface(nf);
        final Button btn = (android.widget.Button)findViewById(R.id.buttonoldfashioned);
        btn.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Whisky.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Whisky_oldfashioned");
                startActivity(intent);
            }
        });

        final Button btn1 = (android.widget.Button)findViewById(R.id.buttonwardeight);
        btn1.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Whisky.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Whisky_wardeight");
                startActivity(intent);
            }
        });

        final Button btn2 = (android.widget.Button)findViewById(R.id.buttonnightcap);
        btn2.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Whisky.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Whisky_NightCap");
                startActivity(intent);
            }
        });

        final Button btn3 = (android.widget.Button)findViewById(R.id.buttonblackjack);
        btn3.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Whisky.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Whisky_BlackJack");
                startActivity(intent);
            }
        });

        final Button btn4 = (android.widget.Button)findViewById(R.id.buttoncafeirlandes);
        btn4.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Whisky.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Whisky_CafeIrlandes");
                startActivity(intent);
            }
        });

    }
}
