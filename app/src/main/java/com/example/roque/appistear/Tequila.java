package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tequila extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tequila);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        final Button btmar = (Button)findViewById(R.id.btmar);
        final Button btpal = (Button)findViewById(R.id.btpal);
        final Button btblm = (Button)findViewById(R.id.btblm);
        final Button btchn = (Button)findViewById(R.id.btchn);
        final Button bttsu = (Button)findViewById(R.id.bttsu);
        btmar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","margarita");
                startActivity(intent);
            }
        });
        btpal.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","paloma");
                startActivity(intent);
            }
        });
        btblm.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","bloody");
                startActivity(intent);
            }
        });
        btchn.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","charro");
                startActivity(intent);
            }
        });
        bttsu.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Tequila.this, Cocteleria_dinamica.class);
                intent.putExtra("var","sunrise");
                startActivity(intent);
            }
        });

    }
}
