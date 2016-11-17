package com.DG.roque.appistear;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class JuegoRetos extends AppCompatActivity {
    ArrayList<String> listajugadores;
    ArrayList<String> Challenges= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_retos);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //Agregar los jugadores a un arreglo
        listajugadores = (ArrayList<String>)(getIntent().getStringArrayListExtra("arr"));
        //Crear un arreglo que contenga los retos
        CreateChallenges();
        Button btnretos=(Button)findViewById(R.id.btnsigret);

        //ingresar al boton la tipografía utilizada
        btnretos.setTypeface(nf);
        btnretos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NUEVA VERSIÓN
                if(Challenges.size()==0) CreateChallenges();
                Game();

                /*VERSION ANTERIOR
                TextView tv=(TextView)findViewById(R.id.reto);
                tv.setVisibility(View.VISIBLE);
                ArrayList<String> listajugadores = (ArrayList<String>) getIntent().getStringArrayListExtra("arr");
                //guardar los retos existentes en un arreglo de strings
                String[] retos=getResources().getStringArray(R.array.retos);
                int tam=listajugadores.size();//obtener la cantidad de jugadores
                int tamret=retos.length;//obtener el numero de retos disponibles
                final Random rnd= new Random();//generar el objeto de clase Random para numeros aleatorios
                int nj=rnd.nextInt(tam)+1;//guardar el numero aleatorio en el rango de 0-numero de jugadores
                int nr=rnd.nextInt(tamret)+1;//guardar el numero aleatorio en el rango de 0-numero de retos
                //asignar el reto y jugador a la interfaz
                tv.setText(listajugadores.get(nj-1).toUpperCase().toString() +", " +retos[nr-1].toUpperCase().toString());
                //tv.setTextColor(Color.parseColor("#4D78A8"));

                */
            }
        });
    }

    //función para mostrar en pantalla el reto y jugador de manera aleatoria
    private void Game(){
        TextView tv=(TextView)findViewById(R.id.reto);
        tv.setVisibility(View.VISIBLE);
        int nr=(int)(Math.random()*Challenges.size());//guardar el numero aleatorio en el rango de 0-numero de jugadores
        int nj;
        String challenge= Challenges.get(nr).toUpperCase().toString();
        Challenges.remove(nr);
        ArrayList <String> players= new ArrayList<>();

        for ( int a= 0; a<listajugadores.size();a++){
            String b= listajugadores.get(a);
            players.add(b);
        }
            for(int i=0;i<listajugadores.size();i++){
                nj=(int)(Math.random()*players.size());
                challenge= challenge.replace("JUGADOR"+(i+1), players.get(nj).toUpperCase());
                players.remove(nj);
            }
            tv.setText(challenge);
    }

    //función para guardar los retos en un arreglo dinámico
    private void CreateChallenges() {
        String[] retos= getResources().getStringArray(R.array.retos);
        for ( int i= 0; i<retos.length;i++){
            Challenges.add(retos[i]);
        }
    }



}