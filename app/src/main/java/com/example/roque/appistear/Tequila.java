package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tequila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tequila);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //asignar los botones de la interfaz a variables, así como agregarles la tipografía
        final Button btmar = (Button)findViewById(R.id.btmar);
        final Button btpal = (Button)findViewById(R.id.btpal);
        final Button btblm = (Button)findViewById(R.id.btblm);
        final Button btchn = (Button)findViewById(R.id.btchn);
        final Button bttsu = (Button)findViewById(R.id.bttsu);
        final TextView bttTe = (TextView) findViewById(R.id.textView);
        bttTe.setTypeface(nf);
        btmar.setTypeface(nf);
        btpal.setTypeface(nf);
        btblm.setTypeface(nf);
        btchn.setTypeface(nf);
        bttsu.setTypeface(nf);
        //Funciones que llaman a la interfaz coctelera_dinamica enviando el tipo de bebdida
        btmar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","tequila_margarita");
                startActivity(intent);
            }
        });
        btpal.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","tequila_paloma");
                startActivity(intent);
            }
        });
        btblm.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","tequila_bloodymaria");
                startActivity(intent);
            }
        });
        btchn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","tequila_charronegro");
                startActivity(intent);
            }
        });
        bttsu.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","tequila_sunrise");
                startActivity(intent);
            }
        });

    }
}
