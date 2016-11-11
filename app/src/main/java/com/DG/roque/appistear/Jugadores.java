package com.DG.roque.appistear;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;

public class Jugadores extends AppCompatActivity {
    int con=1;
    //arreglo para los jugadores y sus nombres
    private ArrayList<EditText> playerName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);
        AdView mAdView = (AdView) findViewById(R.id.advjug);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        //crear el objeto de ArrayList para los jugadores
        final ArrayList<String> jugadores=new ArrayList<String>();
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        final TextView jug=(TextView)findViewById(R.id.jug);//texto de "jugador n"
        final EditText nomjug=(EditText)findViewById(R.id.nomjug);//cuadro de texto para ingresar el nombre del jugador
        Button btn=(Button)findViewById(R.id.conret); //buscar los bonotes de la interfaz
        btn.setTypeface(nf);
        Button add=(Button)findViewById(R.id.add);
        add.setTypeface(nf);
        jug.setText(getText(R.string.jugador)+" " +String.valueOf(con));//ingresar la palabra jugador n al TextView
        //Evento de clic al añadir un nuevo jugador boton de "+"
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //createDynamicPlayer();
                //agregar el jugador al arraylist
                jugadores.add(nomjug.getText().toString());
                con++;
                nomjug.setText("");
                jug.setText(getText(R.string.jugador)+" " +String.valueOf(con));

            }
        });
        //evento de clic para ir a la interfaz para elegir los juegos, si no hay jugadores, no se podrá
        //continuar, es necesario un jugador minimo
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(jugadores.isEmpty())
               {
                   //ventana alerta que indica que no hay jugadores registrados
                   AlertDialog.Builder builder = new AlertDialog.Builder(Jugadores.this);
                   builder.setMessage("Ingrese algunos jugadores,porfa")
                           .setTitle("Atención!!")
                           .setCancelable(false)
                           .setIcon(android.R.drawable.ic_dialog_alert)
                           .setNeutralButton("Aceptar",
                                   new DialogInterface.OnClickListener() {
                                       public void onClick(DialogInterface dialog, int id) {
                                           dialog.cancel();
                                       }
                                   });
                   AlertDialog alert = builder.create();
                   alert.show();
                   Button a = alert.getButton(DialogInterface.BUTTON_NEUTRAL);
                   if(a != null)
                       a.setBackgroundColor(Color.BLUE);
               }
                else {
                   //se abre la interfaz de juegos para elegir entre retos o copa del rey, eviando
                   //el arreglo de jugadores
                   Intent intent = new Intent(Jugadores.this, Juegos.class);
                   intent.putExtra("arr", jugadores);
                   startActivity(intent);
               }
            }
        });
    }


    /*public void createDynamicPlayer(){
       setContentView(R.layout.activity_jugadores);
        RelativeLayout rl = (RelativeLayout)findViewById(R.id.activity_retos);
        setContentView(rl);
        TextView textView  = new TextView(this);
        textView.setText("Jugador"+con);
        EditText editText = new EditText(this);
        RelativeLayout.LayoutParams relativeParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
        rl.addView(textView, relativeParams);
        rl.addView(editText, relativeParams);
        playerstag.add(textView);
        playerName.add(editText);
*/





    }


