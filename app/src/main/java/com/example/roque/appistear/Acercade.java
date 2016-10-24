package com.example.roque.appistear;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");

        final TextView eq = (TextView) findViewById(R.id.equipo);
        final TextView cv = (TextView) findViewById(R.id.cv);
        final TextView rr = (TextView) findViewById(R.id.rr);
        final TextView ka = (TextView) findViewById(R.id.ka);
        final TextView ag = (TextView) findViewById(R.id.ag);
        final TextView jr = (TextView) findViewById(R.id.jr);
        final TextView p1 = (TextView) findViewById(R.id.p1);
        final TextView d1 = (TextView) findViewById(R.id.d1);
        eq.setTypeface(nf);
        cv.setTypeface(nf);
        rr.setTypeface(nf);
        ag.setTypeface(nf);
        ka.setTypeface(nf);
        jr.setTypeface(nf);
        d1.setTypeface(nf);
        p1.setTypeface(nf);

    }
}
