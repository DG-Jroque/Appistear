package com.example.roque.appistear;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Type;
import java.util.Locale;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class Opciones extends AppCompatActivity {


    //Funcion creada para cambiar el idioma
    public void setLocale(String lang) {
        //Creación de Mylocale con el string lang que indica que idioma se asignará
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        //regresar al menú principal refrescando la aplicación
        Intent intent = new Intent(this, MainActivity.class);
        //borrar la pila(Stack) de ventanas anteriores para hacer un correcto cambio de idioma
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
        //Intent refresh = new Intent(this, MainActivity.class);
        //startActivity(refresh);
        //finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        //guardar la tipografía
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        Button btn = (Button)findViewById(R.id.btninfo);
        //asignar la tipografía al boton
        btn.setTypeface(nf);
//Implementamos el evento “click” del botón para cambiar el idioma de la aplicación
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Opciones.this, Acercade.class);
                startActivity(intent);
            }
        });
        Button btn2 = (Button)findViewById(R.id.button_usa);
//Implementamos el evento “click” del botón
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se cambia el idioma a ingles
                setLocale("en");
            }
        });

        Button btn3 = (Button)findViewById(R.id.button_mex);
//Implementamos el evento “click” del botón
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //se cambia el idioma a español
                setLocale("es");
            }
        });
        TextView tv1=(TextView)findViewById(R.id.idioma);
        tv1.setTypeface(nf);


    }
}
