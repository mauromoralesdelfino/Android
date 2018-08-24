package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t = (TextView) findViewById(R.id.txt1);
        t.setText("HOLAHOLA");

        EditText et = (EditText) findViewById(R.id.eText1);
        //et.setText("bla bla bla");
        et.setHint("sfdsd");

        Button btn = (Button) findViewById(R.id.btn1);
       MyListener escuchador = new MyListener(this);
        btn.setOnClickListener(escuchador);
        //t.setText(et.getText().toString());
       // et.setText("");
    }
}
