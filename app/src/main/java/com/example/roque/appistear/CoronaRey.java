package com.example.roque.appistear;

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

    private boolean []state= new boolean[52];

    //private int []Cards = new int [52];
    public ArrayList<Integer> Cards = new ArrayList<Integer>();
    public ArrayList<Integer> text = new ArrayList<Integer>();
    private GestureDetector gestureDetector;
    private TextView tx;
    private int King=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_rey);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);
        createCards();
        tx= (TextView)findViewById(R.id.textView2);
        tx.setTypeface(nf);
        changeBackground();
    }


    public int changeBackground(){
        int max= Cards.size();
        int pos= (int)(Math.random()*max);
        RelativeLayout relativeLayout= (RelativeLayout)findViewById(R.id.activity_corona_rey);
        relativeLayout.setBackgroundResource(Cards.get(pos));
        tx.setText(getString(text.get(pos)));
        Cards.remove(pos);
        if(getString(R.string.copareyk).equalsIgnoreCase(getString(text.get(pos)))){
            King++;
        }
        text.remove(pos);
         if(King ==4 ){
             end();
         }
        return 1;

    }

    public void createCards(){
        for(int i=0; i<image.length;i++){
            Cards.add(image[i]);
            text.add(Text[i]);
        }
    }

    public void end(){
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle(getString(R.string.fincorona));
        adb.setIcon(android.R.drawable.ic_dialog_alert);
        adb.setPositiveButton(getString(R.string.jugardenuevo), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(CoronaRey.this, CoronaRey.class);
                startActivity(intent);
            } });
        adb.setNegativeButton(getString(R.string.salir), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            Intent intent = new Intent(CoronaRey.this, OpCorona.class);
            startActivity(intent);
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
