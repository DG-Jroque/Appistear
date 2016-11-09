package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class OpRetos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op_retos);
        //Crear y guardar la tipografía
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //guardar un un arrayList los jugadores
        final ArrayList<String> jugadores = getIntent().getStringArrayListExtra("arr");
        Button btretos = (Button) findViewById(R.id.btnretos);

        //evento de clic para abir la interfaz para jugar retos
        btretos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(OpRetos.this, JuegoRetos.class);
                intent.putExtra("arr", jugadores);
                startActivity(intent);
            }
        });
        Button bthtp = (Button) findViewById(R.id.btnhtp);
        //evento de clic para abir la interfaz de como jugar en retos
        bthtp.setTypeface(nf);
        bthtp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(OpRetos.this,Comojugar.class);
                intent.putExtra("var", "retos");
                startActivity(intent);
            }
        });

    }
}
