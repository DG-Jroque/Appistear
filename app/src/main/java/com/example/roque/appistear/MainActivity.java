package com.example.roque.appistear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton button = (ImageButton) findViewById(R.id.juegos);
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(context, Juegos.class);
                startActivity(intent);
            }
        });

        ImageButton btn = (ImageButton) findViewById(R.id.cocteleria);
        final Context ct = this;
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(context,Cocteleria.class);
                startActivity(intent);
            }
        });

        ImageButton bt = (ImageButton) findViewById(R.id.opciones);
        final Context ctx = this;
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(context, Opciones.class);
                startActivity(intent);
            }
        });
    }
}
