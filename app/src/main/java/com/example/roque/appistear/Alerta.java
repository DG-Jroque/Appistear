package com.example.roque.appistear;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Alerta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerta);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getString(R.string.mensajealcohol))
                .setTitle(getString(R.string.precaucion))
                .setCancelable(false)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setNeutralButton("Ok",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(Alerta.this, MainActivity.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                finish();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
        Button a = alert.getButton(DialogInterface.BUTTON_NEUTRAL);
        if(a != null)
            a.setBackgroundColor(Color.BLUE);

    }
}
