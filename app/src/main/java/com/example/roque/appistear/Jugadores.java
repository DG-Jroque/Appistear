package com.example.roque.appistear;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;

public class Jugadores extends AppCompatActivity {
    int con=1;
    private ArrayList<TextView> playerstag = new ArrayList<>();
    private ArrayList<EditText> playerName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores);
        final ArrayList<String> jugadores=new ArrayList<String>();
        final TextView jug=(TextView)findViewById(R.id.jug);
        final EditText nomjug=(EditText)findViewById(R.id.nomjug);
        Button btn=(Button)findViewById(R.id.conret);
        Button add=(Button)findViewById(R.id.add);
        jug.setText(getText(R.string.jugador)+" " +String.valueOf(con));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //createDynamicPlayer();
                jugadores.add(nomjug.getText().toString());
                con++;
                nomjug.setText("");
                jug.setText(getText(R.string.jugador)+" " +String.valueOf(con));

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(jugadores.isEmpty())
               {
                   AlertDialog.Builder builder = new AlertDialog.Builder(Jugadores.this);
                   builder.setMessage("Ingrese algunos jugadores,porfa")
                           .setTitle("Atención!!")
                           .setCancelable(false)
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
                   Intent intent = new Intent(Jugadores.this, Juegos.class);
                   intent.putExtra("arr", jugadores);
                   startActivity(intent);
               }
            }
        });
    }


    public void createDynamicPlayer(){
       /* setContentView(R.layout.activity_jugadores);
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

}
