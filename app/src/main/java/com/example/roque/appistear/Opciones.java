package com.example.roque.appistear;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        final Button boton = (Button)findViewById(R.id.btninfo);
//Implementamos el evento “click” del botón
        boton.setTypeface(nf);
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Opciones.this, Acercade.class);
                startActivity(intent);
            }
        });
        final Button btn=(Button)findViewById(R.id.idioma);
        btn.setTypeface(nf);

    }
}
