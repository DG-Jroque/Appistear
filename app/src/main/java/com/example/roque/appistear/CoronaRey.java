package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;

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
    }


    public int changeBackground(){
        int max= Cards.size();
        int pos= (int)(Math.random()*max-1);
        RelativeLayout relativeLayout= (RelativeLayout)findViewById(R.id.activity_corona_rey);
        relativeLayout.setBackgroundResource(Cards.get(pos));
        tx.setText(getString(text.get(pos)));
        Cards.remove(pos);
        if(getString(R.string.copareyk).equalsIgnoreCase(getString(text.get(pos)))){
            King++;
        }
        text.remove(pos);



         if(Cards.size()==0|| King >3 ){
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
        adb.setView( alertDialogView);
        adb.setTitle("Title of alert dialog");
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
        adb.show();
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
