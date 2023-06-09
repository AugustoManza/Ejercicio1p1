package com.example.ejercicio1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityerror extends AppCompatActivity {

    TextView etError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityerror);

        etError= (TextView) findViewById(R.id.etError);
        Bundle bundle= getIntent().getExtras();
        etError.setText(bundle.getString("Error"));



    }
}