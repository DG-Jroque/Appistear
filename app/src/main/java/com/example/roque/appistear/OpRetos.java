package com.example.roque.appistear;

import android.content.Intent;
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
        final ArrayList<String> jugadores = (ArrayList<String>) getIntent().getStringArrayListExtra("arr");
        Button btretos = (Button) findViewById(R.id.btnretos);
        btretos.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(OpRetos.this, JuegoRetos.class);
                intent.putExtra("arr", jugadores);
                startActivity(intent);
            }
        });
        Button bthtp = (Button) findViewById(R.id.btnhtp);
        bthtp.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent =  new Intent(OpRetos.this,Comojugar.class);
                intent.putExtra("var", "retos");
                startActivity(intent);
            }
        });

    }
}
