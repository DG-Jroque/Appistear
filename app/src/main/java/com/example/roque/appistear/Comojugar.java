package com.example.roque.appistear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Comojugar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comojugar);
        String recibir= getIntent().getStringExtra("var");

    }
}
