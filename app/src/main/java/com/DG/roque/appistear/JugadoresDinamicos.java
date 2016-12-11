package com.DG.roque.appistear;


import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.ArrayList;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.view.KeyEvent;


public class JugadoresDinamicos extends AppCompatActivity implements InputFilter {

    private LinearLayout linear;
    private ArrayList<EditText> editTexts = new ArrayList<>();
    private ArrayList<String> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugadores_dinamicos);
        linear= (LinearLayout) findViewById(R.id.linear);
        Typeface nf = Typeface.createFromAsset(getAssets(),  "fonts/spacecomics.ttf");
        createPlayerText();

        final Button boton = (Button)findViewById(R.id.buttonAgregar);
        boton.setTypeface(nf);

//Implementamos el evento “click” del botón para ir al ingreso de jugadores
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                createPlayerText();
            }
        });

        final Button boton2 = (Button)findViewById(R.id.buttonContinuar);
        boton2.setTypeface(nf);
//Implementamos el evento “click” del botón para ir al ingreso de jugadores
        boton2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String mng="";
                names.clear();
                for(int i=0; i<editTexts.size(); i++) {
                    if (!editTexts.get(i).getText().toString().trim().equals("") ) {
                        if(!names.contains(editTexts.get(i).getText().toString().trim())) {
                            names.add(editTexts.get(i).getText().toString().trim());
                        }else{
                            mng= getString(R.string.NombresRepetidos);
                        }

                    }
                }


                if(names.size()<2){
                    mng= (names.size()==0) ? getString(R.string.NoNombres)
                            : getString(R.string.UnNombre);
                    //ventana alerta que indica que no hay jugadores registrados
                    AlertDialog.Builder builder = new AlertDialog.Builder(JugadoresDinamicos.this);
                    builder.setMessage(mng)
                            .setTitle("Atención!!")
                            .setCancelable(false)
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setNeutralButton("Aceptar",
                                    new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();
                                        }
                                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                    Button a = alert.getButton(DialogInterface.BUTTON_NEUTRAL);
                    if(a != null)
                        a.setBackgroundColor(Color.BLUE);
                }
                else{
                    if(mng== getString(R.string.NombresRepetidos))
                    {
                        AlertDialog.Builder builder = new AlertDialog.Builder(JugadoresDinamicos.this);
                        builder.setMessage(mng)
                                .setTitle("Atención!!")
                                .setCancelable(false)
                                .setIcon(android.R.drawable.ic_dialog_alert)
                                .setNeutralButton("Aceptar",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                dialog.cancel();
                                            }
                                        });
                        AlertDialog alert = builder.create();
                        alert.show();
                        Button a = alert.getButton(DialogInterface.BUTTON_NEUTRAL);
                        if(a != null)
                            a.setBackgroundColor(Color.BLUE);
                    }
                    else
                    {
                        Intent intent =  new Intent(JugadoresDinamicos.this, Juegos.class);
                        intent.putExtra("arr", names);
                        startActivity(intent);
                    }
                }


            }

        });

    }

    public void createPlayerText(){
        EditText ed= new EditText(this);
        ed.setSingleLine();
        ed.setFilters(new InputFilter[] {new InputFilter.LengthFilter(15)});
        editTexts.add(ed);
        linear.addView(ed);
        ed.setOnEditorActionListener(
                new EditText.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                        // Identifier of the action. This will be either the identifier you supplied,
                        // or EditorInfo.IME_NULL if being called due to the enter key being pressed.
                        if (actionId == EditorInfo.IME_ACTION_SEARCH
                                || actionId == EditorInfo.IME_ACTION_DONE
                                || event.getAction() == KeyEvent.ACTION_DOWN
                                && event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                            createPlayerText();
                            editTexts.get(editTexts.size()-1).requestFocus();
                            return true;
                        }
                        // Return true if you have consumed the action, else false.
                        return false;
                    }
                });
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
        return null;
    }
}