package com.DG.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //banner de publicidad
        AdView mAdView = (AdView) findViewById(R.id.av_bottom_banner);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //menu principal
        //creación y guardado de la tipografía
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");

        final Button boton = (Button)findViewById(R.id.juegos);
        boton.setTypeface(nf);
//Implementamos el evento “click” del botón para ir al ingreso de jugadores
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, JugadoresDinamicos.class);
                startActivity(intent);
            }
        });

        final Button btn = (Button)findViewById(R.id.cocteleria);
        btn.setTypeface(nf);
//Implementamos el evento “click” del botón para ir a la coctelera 
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Cocteleria.class);
                startActivity(intent);
            }
        });

        final Button bt = (Button)findViewById(R.id.opciones);
        bt.setTypeface(nf);
//Implementamos el evento “click” del botón para ir a la interfaza de opciones
        bt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Opciones.class);
                startActivity(intent);
            }
        });

    }

    

}
