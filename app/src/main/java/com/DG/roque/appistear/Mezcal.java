package com.DG.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mezcal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezcal);
        //guardar la tipografía en un objeto de la clase TypeFace
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //obtener los botones de la interfaz de mezcal
        final Button bttun = (Button)findViewById(R.id.buttontunacuxe);
        final Button btzig = (Button)findViewById(R.id.btzig);
        final Button btmst = (Button)findViewById(R.id.buttonmezcalsunset);
        final Button btblm = (Button)findViewById(R.id.buttonblackmex);
        final Button bthot = (Button)findViewById(R.id.buttonhotp);
        final TextView bttTe = (TextView) findViewById(R.id.textView);
        //asignar la tipografía a los botnoes
        bttTe.setTypeface(nf);
        bthot.setTypeface(nf);
        btzig.setTypeface(nf);
        bttun.setTypeface(nf);
        btblm.setTypeface(nf);
        btmst.setTypeface(nf);

        //Funciones que llaman a la interfaz de Coctelera_dinamica , enviando como parametro extra un
        //string para identificar que bebida se debe mostrar
        bthot.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_hotpinneapple");
                startActivity(intent);
            }
        });
        btzig.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_zignumocuilli");
                startActivity(intent);
            }
        });
        bttun.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_tunacuixe");
                startActivity(intent);
            }
        });
        btblm.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_Blackmexican");
                startActivity(intent);
            }
        });
        btmst.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_sunset");
                startActivity(intent);
            }
        });
    }
}
