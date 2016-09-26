package com.yolimaandrea.punto3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText lad, bas, alt, rad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    // lad = (EditText) findViewById(R.id.etlado);
    // bas = (EditText) findViewById(R..etidBase);
    //alt = (EditText) findViewById(R.id.etAltura);
    //rad = (EditText) findViewById(R.id.etRadio);
    //Button btcalcular = (Button) findViewById(R.id.buttonCalcular);


    // btcalcular.setOnClickListener(new View.OnClickListener() {
    // @Override
    public void calcularClik (View v) {
        final TextView tvResultado = (TextView) findViewById(R.id.textViewResultado);

        switch (v.getId()) {

            case R.id.rbCirculo:

                rad = (EditText) findViewById(R.id.etRadio);
                double pi = 3.14159265359;
                double radio = Integer.valueOf(rad.getText().toString());
                double areaCir = pi * radio;
                tvResultado.setText("El area del circulo es: " + areaCir);
                break;
            case R.id.rbtriangulo:
                bas = (EditText) findViewById(R.id.etBase);
                alt = (EditText) findViewById(R.id.etAltura);
                double base = Integer.valueOf(bas.getText().toString());
                double altura = Integer.valueOf(alt.getText().toString());
                double areaTri = (base * altura) / 2;
                tvResultado.setText("El area del triangulo es: " + areaTri);
                break;
            case R.id.rbCuadrado:
                lad = (EditText) findViewById(R.id.etlado);
                double lado = Integer.valueOf(lad.getText().toString());
                double areaCua = lado * lado;
                tvResultado.setText("El area del cuadrado es:" + areaCua);
                break;
            case R.id.rbRectangulo:
                bas = (EditText) findViewById(R.id.etBase);
                alt = (EditText) findViewById(R.id.etAltura);
                double baser = Integer.valueOf(bas.getText().toString());
                double alturar = Integer.valueOf(alt.getText().toString());
                double areaRec = baser * alturar;
                tvResultado.setText("El area del rectangulo es: " + areaRec);
                break;
        }
    }
}

