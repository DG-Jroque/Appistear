package com.example.roque.appistear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Opciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);

        final Button boton = (Button)findViewById(R.id.btninfo);
//Implementamos el evento “click” del botón
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(Opciones.this, Acercade.class);
                startActivity(intent);
            }
        });


    }
}
