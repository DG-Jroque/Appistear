package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Type;

public class Ron extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ron);
        //crear y guardar la tipografía
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //obtener todos los botones de la interfaz y asignarles la tipografía
        final Button btcub = (Button)findViewById(R.id.btcub);
        final Button btpco = (Button)findViewById(R.id.btpco);
        final Button btmoj = (Button)findViewById(R.id.btmoj);
        final Button btdik = (Button)findViewById(R.id.btdik);
        final Button btblh = (Button)findViewById(R.id.btblh);
        final TextView bttTe = (TextView) findViewById(R.id.textView);
        bttTe.setTypeface(nf);
        btcub.setTypeface(nf);
        btpco.setTypeface(nf);
        btmoj.setTypeface(nf);
        btdik.setTypeface(nf);
        btblh.setTypeface(nf);

        /**************************
         Funciones que llaman a la interfaz coctelera_dinamica enviando el tipo de bebdida
         **************************/
        btcub.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Ron.this, Cocteleria_dinamica.class);
                intent.putExtra("var","ron_cubalibre");
                startActivity(intent);
            }
        });
        btpco.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Ron.this, Cocteleria_dinamica.class);
                intent.putExtra("var","ron_pinacolada");
                startActivity(intent);
            }
        });
        btmoj.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Ron.this, Cocteleria_dinamica.class);
                intent.putExtra("var","ron_mojito");
                startActivity(intent);
            }
        });
        btdik.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Ron.this, Cocteleria_dinamica.class);
                intent.putExtra("var","ron_daikiri");
                startActivity(intent);
            }
        });
        btblh.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Ron.this, Cocteleria_dinamica.class);
                intent.putExtra("var","ron_bluehawaiian");
                startActivity(intent);
            }
        });
    }
}
