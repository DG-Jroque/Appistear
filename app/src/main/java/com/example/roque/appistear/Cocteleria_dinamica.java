package com.example.roque.appistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class Cocteleria_dinamica extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria_dinamica);
        String recibir= getIntent().getStringExtra("var");
        recibir= recibir.toLowerCase();
        switch(recibir){
            case "tequila_margarita":
                tequila_margarita();
                break;
            default:
                break;
        }
    }

    public void tequila_margarita(){

        ((TextView)findViewById(R.id.textView_titulo)).setText("Margarita");
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");

    }
}
