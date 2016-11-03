package com.example.roque.appistear;

import android.renderscript.Allocation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.lang.reflect.Field;

public class CoronaRey extends AppCompatActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private Field []img= new Field[52];
    private int []Cards = new int [52];
    private GestureDetector gestureDetector;
    private int pos=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona_rey);
        gestureDetector = new GestureDetector(this, this);
        gestureDetector.setOnDoubleTapListener(this);

    }
    public void changeBackground(){
        pos++;
        RelativeLayout relativeLayout= (RelativeLayout)findViewById(R.id.activity_corona_rey);
        relativeLayout.setBackgroundResource(Cards[pos]);
        String name = img[pos].getName();
        TextView textView = (TextView)findViewById(R.id.textView2);
        textView.setText(name);

    }

    public void createCards(){
        Field[] ID_Fields = R.mipmap.class.getFields();
        for(int i = 0; i < ID_Fields.length; i++) {
            try {
                if(ID_Fields[i].getName().contains("botella")|| ID_Fields[i].getName().contains("vaso")
                        || ID_Fields[i].getName().contains("copa") || ID_Fields[i].getName().contains("tarro")){
                    img[i]= ID_Fields[i];
                Cards[i] = ID_Fields[i].getInt(null);
                }

            } catch (Exception e) {
                // TODO Auto-generated catch block

            }
        }
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
