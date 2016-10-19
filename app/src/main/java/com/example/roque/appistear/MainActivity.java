package com.example.roque.appistear;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton button;

    public void juegos(){
        button = (ImageButton) findViewById(R.id.juegos);
        final Context context = this;
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(context, Juegos.class);
                startActivity(intent);
            }
        });
    }

    public void Coctelera(){
        button = (ImageButton) findViewById(R.id.cocteleria);
        final Context ct = this;
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ct,Cocteleria.class);
                startActivity(intent);
            }
        });
    }

    public void Opciones(){
        button = (ImageButton) findViewById(R.id.opciones);
        final Context ctx = this;
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(ctx, Opciones.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        juegos();
        Coctelera();
        Opciones();
    }


}
