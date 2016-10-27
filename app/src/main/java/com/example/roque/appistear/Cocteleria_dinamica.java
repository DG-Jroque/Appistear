package com.example.roque.appistear;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class Cocteleria_dinamica extends AppCompatActivity {
    public Typeface nf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria_dinamica);
        nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
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
            case "vodka_bloodymary":
                vodka_bloodymary();
                break;
            case "vodka_moradito":
                vodka_moradito();
                break;
            case "vodka_blueberryspritzer":
                vodka_blueberrySpritzer();
                break;
            case "vodka_sexonthebeach":
                vodka_SexOnTheBeach();
                break;
            default:
                break;
        }

    }

    /***************
     METHODS FOR TEQUILA
     *****************/
    public void tequila_margarita(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setTypeface(nf);
                titulo.setText("Margarita");

        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_Margarita));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_Margarita));
    }

    public void tequila_paloma(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Paloma");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Paloma");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Paloma");
    }

    public void tequila_charroNegro(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Charro Negro");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_CharroNegro");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_CharroNegro");
    }

    public void tequila_bloodyMaria(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Blood Maria");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void tequila_sunrise(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Sunrise");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    /***************
    METHODS FOR VODKA
   *****************/

    public void vodka_whiteRussian(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("White Russian");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void vodka_bloodymary(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Bloody Mary");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void vodka_moradito(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Moradito");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void vodka_blueberrySpritzer(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Blueberry Spritzer");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    public void vodka_SexOnTheBeach(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("Sex On The Beach");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText("@string/prepararTequila_Margarita");
        ((TextView)findViewById(R.id.textView_ingredientes)).setText("@string/ingredientesTequila_Margarita");
    }

    /***************
     METHODS FOR RUM
     *****************/

}
