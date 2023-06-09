package com.example.ejercicio1p1;

import static com.example.ejercicio1p1.R.id.total;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resFunAritme extends AppCompatActivity {


    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_fun_aritme);


        resultado=(TextView) findViewById(R.id.total);
        Bundle bundle =getIntent().getExtras();

        resultado.setText(bundle.getString("Resultado"));
    }
}