package com.example.roque.appistear;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class Cocteleria_dinamica extends AppCompatActivity {
    /*variable Typeface para tipografías creada de manera global en la clase para hacer uso de ella
    en diferentes funciones.
    */
    public Typeface nf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria_dinamica);
        nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //se recibe una variable de tipo string, mandada desde la ventana anterior y nos indicará
        //que tipo de bebida es la que se quiere acceder, todos los botones de bebidas llaman a
        //esta interfaz para generar las bebidas de manera más dinamica
        String recibir= getIntent().getStringExtra("var");
        recibir= recibir.toLowerCase();
        //se hace un switch con la variable recibida para determinar qué bebida fue llamada
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
            case "tequila_sunrise":
                tequila_sunrise();
                break;
            //VODKA
            case "vodka_whiterussian":
                vodka_whiteRussian();
                break;
            case "vodka_bloodymary":
                vodka_bloodyMary();
                break;
            case "vodka_moradito":
                vodka_moradito();
                break;
            case "vodka_blueberryspritzer":
                vodka_blueberrySpritzer();
                break;
            case "vodka_sexonthebeach":
                vodka_sexOnTheBeach();
                break;
            //WHISKY
            case "whisky_oldfashioned":
                whisky_oldFashioned();
                break;
            case "whisky_wardeight":
                whisky_wardEight();
                break;
            case "whisky_nightcap":
                whisky_nightCap();
                break;
            case "whisky_blackjack":
                whisky_blackJack();
                break;
            case "whisky_cafeirlandes":
                whisky_cadeIrlandes();
                break;
            //RON
            case "ron_cubalibre":
                ron_cubaLibre();
                break;
            case "ron_pinacolada":
                ron_pinacolada();
                break;
            case "ron_mojito":
                ron_mojito();
                break;
            case "ron_daikiri":
                ron_daikiri();
                break;
            case "ron_bluehawaiian":
                ron_bluehawaiian();
                break;
            //MEZCAL
            case "mezcal_zignumocuilli":
                mezcal_zignumocuilli();
                break;
            case "mezcal_hotpinneapple":
                mezcal_hotpinneapple();
                break;
            case "mezcal_tunacuixe":
                mezcal_tunacuixe();
                break;
            case "mezcal_sunset":
                mezcal_sunset();
                break;
            case "mezcal_blackmexican":
                mezcal_blackmexican();
                break;
            default:
                break;
        }

    }

    /*
    En los siguientes metodos, se modifica el titulo de la interfaz  ( por medio de un TeXTview titulo,
    y se ingresan las cadenas string de ingles o español, así como la tipografía con la variable
     "nf "en dos TextViews, sin embargo estos textviews
    no se reservan en una variable, solo se les hace la modificación a los textos de forma directa
     */

    /***************
     METODOS PARA EL TEQUILA
     *****************/
    public void tequila_margarita(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setTypeface(nf);
                titulo.setText("MARGARITA");

        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_Margarita));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_Margarita));
    }

    public void tequila_paloma(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("PALOMA");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_Paloma));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_Paloma));
    }

    public void tequila_charroNegro(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("CHARRO \n\nNEGRO");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_CharroNegro));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_CharroNegro));
    }

    public void tequila_bloodyMaria(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("BLOODY \n\nMARIA");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_BloodyMaria));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_BloodyMaria));
    }

    public void tequila_sunrise(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("SUNRISE");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararTequila_Sunrise));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesTequila_Sunrise));
    }

    /***************
     METODOS PARA EL WHISKY
     *****************/
    public void whisky_oldFashioned(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("OLD \n\nFASHIONED");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararWhisky_OldFashioned));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesWhisky_OldFashioned));
    }

    public void whisky_wardEight(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("WARD EIGHT");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararWhisky_WardEight));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesWhisky_WardEight));
    }

    public void whisky_nightCap(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("NIGHT CAP");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararWhisky_NightCap));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesWhisky_NightCap));
    }

    public void whisky_blackJack(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("BLACK JACK");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararWhisky_BlackJack));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesWhisky_BlackJack));
    }

    public void whisky_cadeIrlandes(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("CAFÉ \n\nIRLANDÉS");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararWhisky_CafeIrlandes));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesWhisky_CafeIrlandes));
    }

    /***************
     METODOS PARA EL VODKA
   *****************/

    public void vodka_whiteRussian(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("WHITE \n\n RUSSIAN");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararVodka_WhiteRussian));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesVodka_WhiteRussian));
    }

    public void vodka_bloodyMary(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("BLOODY\n\n MARY");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararVodka_BloodyMary));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesVodka_BloodyMary));
    }

    public void vodka_moradito(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("MORADITO");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararVodka_Moradito));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesVodka_Moradito));
    }

    public void vodka_blueberrySpritzer(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("BLUEBERRY SPRITZER");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararVodka_BlueberrySpritzer));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesVodka_BlueberrySpritzer));
    }

    public void vodka_sexOnTheBeach(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("SEX ON \n" +
                "\nTHE BEACH");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararVodka_SexOnTheBeach));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesVodka_SexOnTheBeach));
    }

    /***************
     METODOS PARA EL RON
     *****************/

    public void ron_cubaLibre(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("CUBA \n\nLIBRE");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararRon_CubaLibre));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesRon_CubaLibre));
    }

    public void ron_pinacolada(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("PIÑA COLADA");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararRon_PinaColada));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesRon_PinaColada));
    }

    public void ron_mojito(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("MOJITO");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararRon_Mojito));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesRon_Mojito));
    }

    public void ron_daikiri(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("DAIKIRI");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararRon_Daikiri));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesRon_Daikiri));
    }

    public void ron_bluehawaiian(){
        TextView titulo= (TextView)findViewById(R.id.textView_titulo);
        titulo.setText("BLUE \n" +
                "\nHAWAIIAN");
        titulo.setTypeface(nf);
        ((TextView)findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararRon_BlueHawaiian));
        ((TextView)findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesRon_BlueHawaiian));
    }

    /***************
     METODOS PARA EL MEZCAL
     *****************/

    public void mezcal_zignumocuilli() {
        TextView titulo = (TextView) findViewById(R.id.textView_titulo);
        titulo.setText("ZIGNUM \n\nOCUILLI");
        titulo.setTypeface(nf);
        ((TextView) findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararMezcal_Zignumocuilli));
        ((TextView) findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesMezcal_Zignumocuilli));
    }

    public void mezcal_hotpinneapple() {
        TextView titulo = (TextView) findViewById(R.id.textView_titulo);
        titulo.setText("HOT \n\nPINNEAPPLE");
        titulo.setTypeface(nf);
        ((TextView) findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararMezcal_Hotpinneapple));
        ((TextView) findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesMezcal_HotPinneapple));
    }

    public void mezcal_tunacuixe() {
        TextView titulo = (TextView) findViewById(R.id.textView_titulo);
        titulo.setText("TUNACIIXE");
        titulo.setTypeface(nf);
        ((TextView) findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararMezcal_Tunacuixe));
        ((TextView) findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesMezcal_Tunacuixe));
    }

    public void mezcal_sunset() {
        TextView titulo = (TextView) findViewById(R.id.textView_titulo);
        titulo.setText("SUNSET");
        titulo.setTypeface(nf);
        ((TextView) findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararMezcal_Sunset));
        ((TextView) findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesMezcal_Sunset));
    }

    public void mezcal_blackmexican() {
        TextView titulo = (TextView) findViewById(R.id.textView_titulo);
        titulo.setText("BLACK \n\nMEXICAN");
        titulo.setTypeface(nf);
        ((TextView) findViewById(R.id.textView_preparar)).setText(getString(R.string.prepararMezcal_BlackMexican));
        ((TextView) findViewById(R.id.textView_ingredientes)).setText(getString(R.string.ingredientesMezcal_BlackMexcan));
    }






    }
