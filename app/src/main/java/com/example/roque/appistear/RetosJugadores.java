package com.example.roque.appistear;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class RetosJugadores extends AppCompatActivity {
    int con=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retos);
        final ArrayList<String> jugadores=new ArrayList<String>();
        final TextView jug=(TextView)findViewById(R.id.jug);
        final EditText nomjug=(EditText)findViewById(R.id.nomjug);
        Button btn=(Button)findViewById(R.id.conret);
        Button add=(Button)findViewById(R.id.add);
        jug.setText(jug.getText().toString()+" " +String.valueOf(con));
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jugadores.add(nomjug.getText().toString());
                con++;
                nomjug.setText("");
                jug.setText(jug.getText().toString()+" " +String.valueOf(con));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(jugadores.isEmpty())
               {
                   AlertDialog.Builder builder = new AlertDialog.Builder(RetosJugadores.this);
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
               }
                else {

                   Intent intent = new Intent(RetosJugadores.this, JuegoRetos.class);
                   intent.putExtra("arr", jugadores);
                   startActivity(intent);

               }
            }
        });

    }

}
