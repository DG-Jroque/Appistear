package com.example.roque.appistear;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;


public class copa_del_rey extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private int pos=0;
    private GestureDetector gd;
    private int [] Cards = new int[56];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copa_del_rey);
        GenerateCards();
        this.gd= new GestureDetectorCompat(this, this);
        gd.setOnDoubleTapListener(this);
    }

    public void changeBackgroud(){
        RelativeLayout RL= (RelativeLayout)findViewById(R.id.content_copa_del_rey);
        try {
            RL.setBackgroundResource(Cards[pos]);
        }catch(Exception ex){

        }
    }

    public void GenerateCards(){
        Field[] ID_Fields = R.mipmap.class.getFields();
        for(int i = 0; i < ID_Fields.length; i++) {
            try {
                if(ID_Fields[i].getName().contains("botella") || ID_Fields[i].getName().contains("tarro")
                        || ID_Fields[i].getName().contains("vaso")
                        || ID_Fields[i].getName().contains("copa")){
                    Cards[i] = ID_Fields[i].getInt(null);
                }
            } catch (IllegalArgumentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }

    public void changeCard(){
        changeBackgroud();
        pos++;


    }

    @Override
    public boolean onDown(MotionEvent e) {
        changeCard();
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        changeCard();
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        changeCard();
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        changeCard();
        return true;
    }


    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        changeCard();
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        changeCard();
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        changeCard();
        return true;
    }
}
