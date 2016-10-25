package com.example.roque.appistear;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Cocteleria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        final Button btequila = (Button)findViewById(R.id.bttequila);
        final Button bron = (Button)findViewById(R.id.btron);
        final Button bvodka = (Button)findViewById(R.id.btvodka);
        final Button bwhisky = (Button)findViewById(R.id.btwhisky);
        final Button bmezcal = (Button)findViewById(R.id.btmezcal);

//Implementamos el evento “click” del botón
        btequila.setTypeface(nf);
        bron.setTypeface(nf);
        bvodka.setTypeface(nf);
        bwhisky.setTypeface(nf);
        bmezcal.setTypeface(nf);

    }
}
