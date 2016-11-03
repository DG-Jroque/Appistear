package com.example.roque.appistear;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class CoronaRey extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener, DatosCopaDelRey{

    private boolean []state= new boolean[52];

    //private int []Cards = new int [52];
    public ArrayList<Integer> Cards = new ArrayList<Integer>();
    public ArrayList<Integer> text = new ArrayList<Integer>();
    private GestureDetector gestureDetector;
    private TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_rey);
        gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);
        createCards();
        tx= (TextView)findViewById(R.id.textView2);
        Button bt= (Button)findViewById(R.id.buttoncoparey);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBackground();
            }
        });
    }
    public int changeBackground(){
        int max= Cards.size();
        int pos= (int)(Math.random()*max-1);
        RelativeLayout relativeLayout= (RelativeLayout)findViewById(R.id.activity_corona_rey);
        relativeLayout.setBackgroundResource(Cards.get(pos));
        tx.setText(getString(text.get(pos)));
        Cards.remove(pos);
        text.remove(pos);

         if(Cards.size()==0){
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

    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        changeBackground();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        changeBackground();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        changeBackground();
        return true;
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
        changeBackground();
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        changeBackground();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        changeBackground();
        return true;
    }
}
