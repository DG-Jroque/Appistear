package com.DG.roque.appistear;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import android.content.DialogInterface;

public class CoronaRey extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener, DatosCopaDelRey{

    /*
    ArrayList creado para ingresar las cartas e instrucciones, y poderlas eliminar de manera
    dinamica, al eliminar todas las localidades del Array, se acaba el juego
     */
    public ArrayList<Integer> Cards = new ArrayList<Integer>();
    public ArrayList<Integer> text = new ArrayList<Integer>();
    //objeto creado para identificar los gestos del usuario al tocar la pantalla
    private GestureDetector gestureDetector;
    private TextView tx;
    //contador para determinar cuantos reyes han salido, al 4 rey, se termina el juego
    private int King=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //inicio y creación de la interfaz
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_rey);
        //creación de la tipografía, guardada en un objeto TypeFace
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        //Creacion del objeto GestureDetector para detectar los gestos creados por el usuario
        gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);
        //Función para guardar las cartas en el ArrayList
        createCards();
        //texo creado para las instrucciones con la tipografía empelada en casi todo el juego
        tx= (TextView)findViewById(R.id.textView2);
        tx.setTypeface(nf);
        //funcion para iniciar el juego
        changeBackground();
    }

    //Funcion para cambiar el fonodo, cambiando las cartasy para inicar el juego
    public int changeBackground(){
        int max= Cards.size();//determinar cuantas cartas quedan disponibles
        int pos= (int)(Math.random()*max);//elegir un numero al azar de 0 al numero de cartas disponible
        RelativeLayout relativeLayout= (RelativeLayout)findViewById(R.id.activity_corona_rey);
        //asignar a la interfaz un nuevo fondo, cambiando las cartas de la posicion aleatoria en el ArrayList
        relativeLayout.setBackgroundResource(Cards.get(pos));
        //asignar a la interfaz la instruccion que corresponde a la carta, ubicandolos por la misma posición
        //en el arreglo
        tx.setText(getString(text.get(pos)));
        //Eliminar la carta
        Cards.remove(pos);
        //verificar si la carta es un rey, en caso de serlo incrementar el contador del rey en uno
        if(getString(R.string.copareyk).equalsIgnoreCase(getString(text.get(pos)))){
            King++;
        }
        //eliminar la instrucción del ArrayList
        text.remove(pos);
        //Si el contador llega a 4, se acaba el juego
         if(King ==4 ){
             end();
         }
        return 1;

    }

    //Función para guardar las cartas e instrucciones de la interfaz que se implementa DatosCopaDelRey
    public void createCards(){
        for(int i=0; i<image.length;i++){
            Cards.add(image[i]);
            text.add(Text[i]);
        }
    }

    //funcion para reiniciar el juego
    public void StartGame(){

        Cards.clear();
        text.clear();
        King=0;
        createCards();
        //funcion para iniciar el juego
        changeBackground();

    }

    //Función para terminar el juego
    public void end(){
        //mostrar un menaje de alerta para indicar el fin del juego
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle(getString(R.string.fincorona));
        adb.setIcon(android.R.drawable.ic_dialog_alert);
        //botones para indicar si quiere volver a jugar o salir
        adb.setPositiveButton(getString(R.string.jugardenuevo), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(CoronaRey.this, CoronaRey.class);
                startActivity(intent);
            } });
        adb.setNegativeButton(getString(R.string.salir), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            StartGame();
        } });
        AlertDialog alert = adb.create();
        alert.show();
        Button a = alert.getButton(DialogInterface.BUTTON_NEGATIVE);
        if(a != null)
            a.setBackgroundColor(Color.BLUE);
        Button b = alert.getButton(DialogInterface.BUTTON_POSITIVE);
        if(b != null)
        b.setBackgroundColor(Color.BLUE);


    }

    //Funciones para los gestos, las que regresen true, son realizadas y llaman a la función
    //ChangeBackgroud para cambiar la carta que el usuario ve
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        changeBackground();
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
                return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }
}
