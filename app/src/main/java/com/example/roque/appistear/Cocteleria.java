package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cocteleria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria);
        //Objeto tipografía para el estilo de letra usado
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //obtener los botones de la interfaz para poder utilizarlos como objetos de la clase Button
        final Button btequila = (Button)findViewById(R.id.bttequila);
        final Button bron = (Button)findViewById(R.id.btron);
        final Button bvodka = (Button)findViewById(R.id.btvodka);
        final Button bwhisky = (Button)findViewById(R.id.btwhisky);
        final Button bmezcal = (Button)findViewById(R.id.btmezcal);
//Definimos la tipografia para los botones
        btequila.setTypeface(nf);
        bron.setTypeface(nf);
        bvodka.setTypeface(nf);
        bwhisky.setTypeface(nf);
        bmezcal.setTypeface(nf);

//Implementamos el evento “click” de los botone


        //evento  de clic para iniciar la interfaz de Ron
        bron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cocteleria.this,Ron.class);
                startActivity(intent);
            }
        });
        //evento  de clic para iniciar la interfaz de tequila
        btequila.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cocteleria.this,Tequila.class);
                startActivity(intent);
            }
        });
//evento  de clic para iniciar la interfaz de Vodka
        bvodka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cocteleria.this,Vodka.class);
                startActivity(intent);
            }
        });
        //evento  de clic para iniciar la interfaz de Whisky
        bwhisky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cocteleria.this,Whisky.class);
                startActivity(intent);
            }
        });
//evento  de clic para iniciar la interfaz de Mezcal
        bmezcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Cocteleria.this,Mezcal.class);
                startActivity(intent);
            }
        });




    }
}
