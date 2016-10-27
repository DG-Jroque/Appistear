package com.example.roque.appistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class Cocteleria_dinamica extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria_dinamica);
        String recibir= getIntent().getStringExtra("var");
        recibir= recibir.toLowerCase();
        switch(recibir){
            //TEQUILA
            case "tequila_margarita":
                tequila_margarita();
                break;
            case "tequila_paloma":
                tequila_paloma();
                break;
            case "tequila_charronegro":
                tequila_charroNegro();
                break;
            case "tequila_bloodymaria":
                tequila_bloodyMaria();
                break;
            case "tequial_sunrise":
                tequila_sunrise();
                break;
            //VODKA
            case "vodka_whiterussian":
                vodka_whiteRussian();
                break;
            default:
                break;
        }

    }

    /***************
     METHODS FOR TEQUILA
     *****************/
    public void tequila_margarita(){
        ((TextView)findViewById(R.id.textView_titulo)).setText("Margarita");
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_Margarita));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_Margarita));
    }

    public void tequila_paloma(){
        ((TextView)findViewById(R.id.textView_titulo)).setText("Paloma");
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void tequila_charroNegro(){
        ((TextView)findViewById(R.id.textView_titulo)).setText("Charro Negro");
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void tequila_bloodyMaria(){
        ((TextView)findViewById(R.id.textView_titulo)).setText("Blood Maria");
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void tequila_sunrise(){
        ((TextView)findViewById(R.id.textView_titulo)).setText("Sunrise");
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    /***************
    METHODS FOR VODKA
   *****************/

    public void vodka_whiteRussian(){
        ((TextView)findViewById(R.id.textView_titulo)).setText("White Russian");
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

}
