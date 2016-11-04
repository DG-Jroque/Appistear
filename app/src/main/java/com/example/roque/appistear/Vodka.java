package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vodka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vodka);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");

        final TextView bttTe = (TextView) findViewById(R.id.textView);
        bttTe.setTypeface(nf);

        final Button btn = (Button)findViewById(R.id.buttonwhiterussian);
        btn.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Vodka.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Vodka_WhiteRussian");
                startActivity(intent);
            }
        });

        final Button btn1 = (Button)findViewById(R.id.buttonblueberryspritzer);
        btn1.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Vodka.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Vodka_BlueberrySpritzer");
                startActivity(intent);
            }
        });

        final Button btn2 = (Button)findViewById(R.id.buttonbloodymary);
        btn2.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Vodka.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Vodka_BloodyMary");
                startActivity(intent);
            }
        });


        final Button btn3 = (Button)findViewById(R.id.buttonmoradito);
        btn3.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Vodka.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Vodka_Moradito");
                startActivity(intent);
            }
        });

        final Button btn4 = (Button)findViewById(R.id.buttonsexonthebeach);
        btn4.setTypeface(nf);
//Implementamos el evento “click” del botón
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =  new Intent(Vodka.this, Cocteleria_dinamica.class);
                intent.putExtra("var", "Vodka_SexOnTheBeach");
                startActivity(intent);
            }
        });
    }
}
