package com.example.roque.appistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class Cocteleria_dinamica extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocteleria_dinamica);
        String recibir= getIntent().getStringExtra("var");
        switch(recibir){
            case "mararita":
                break;
            default:
                break;
        }
    }

    public void margarita(){


    }
}
