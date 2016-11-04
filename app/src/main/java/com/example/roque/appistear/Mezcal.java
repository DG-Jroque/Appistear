package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mezcal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mezcal);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        final Button bthot = (Button)findViewById(R.id.bthot);
        final Button btzig = (Button)findViewById(R.id.btzig);
        final Button bttun = (Button)findViewById(R.id.bttun);
        final Button btblm = (Button)findViewById(R.id.btblm);
        final Button btmst = (Button)findViewById(R.id.btmst);
        final TextView bttTe = (TextView) findViewById(R.id.textView);
        bttTe.setTypeface(nf);
        bthot.setTypeface(nf);
        btzig.setTypeface(nf);
        bttun.setTypeface(nf);
        btblm.setTypeface(nf);
        btmst.setTypeface(nf);
        bthot.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_hotpinneapple");
                startActivity(intent);
            }
        });
        btzig.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_zignumocuilli");
                startActivity(intent);
            }
        });
        bttun.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_tunacuixe");
                startActivity(intent);
            }
        });
        btblm.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_Blackmexican");
                startActivity(intent);
            }
        });
        btmst.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(Mezcal.this, Cocteleria_dinamica.class);
                intent.putExtra("var","mezcal_sunset");
                startActivity(intent);
            }
        });
    }
}
