package com.example.alumno.myapplication;

import android.provider.Settings;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alumno on 23/08/2018.
 */

public class MyListener implements View.OnClickListener
{
    private View _text;
    private View _editT;
    private View _btn;
    private MainActivity _miAct;

    @Override
    public void onClick(View v)
    {
        System.out.println("Hola boton");
        TextView t = (TextView) _miAct.findViewById(R.id.txt1);
        t.setText("HOLAHOLA");

        EditText et = (EditText) findViewById(R.id.eText1);
        //et.setText("bla bla bla");
        et.setHint("sfdsd");

        Button btn = (Button) findViewById(R.id.btn1);
        t.setText(et.getText().toString());
        et.setText("");

    }

    public MyListener( MainActivity act)
    {
        this._miAct = act;
    }

    public View get_btn() {
        return _btn;
    }

    public View get_text() {
        return _text;
    }

    public View get_editT() {
        return _editT;
    }

    public void set_text(View _text) {
        this._text = _text;
    }

    public void set_editT(View _editT) {
        this._editT = _editT;
    }

    public void set_btn(View _btn) {
        this._btn = _btn;
    }

    public MainActivity get_miAct() {
        return _miAct;
    }

    public void set_miAct(MainActivity _miAct) {
        this._miAct = _miAct;
    }
}
