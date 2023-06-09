package com.example.ejercicio1p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsuma, btnresta, btndivision, btnmultip;
    TextView numero1, numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnsuma = (Button) findViewById(R.id.btnsuma);
        btnresta = (Button) findViewById(R.id.btnresta);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnmultip = (Button) findViewById(R.id.btnmultip);

        numero1=(EditText) findViewById(R.id.numero1);
        numero2=(EditText) findViewById(R.id.numero2);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suma();
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resta();
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dividir();
            }
        });

        btnmultip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiplicar();
            }
        });



    }



    private void suma() {

        String v1=numero1.getText().toString();
        String v2=numero2.getText().toString();

        if(TextUtils.isEmpty(v1)||TextUtils.isEmpty(v2))
        {
            error ("Haz dejado Campos Vacios");

        }
        else{
            int valor1=Integer.parseInt(v1);
            int valor2=Integer.parseInt(v2);
            int res=valor1+valor2;

            Operacion(String.valueOf(res));

        }


    }

    private void resta() {

        String v1=numero1.getText().toString();
        String v2=numero2.getText().toString();

        if(TextUtils.isEmpty(v1)||TextUtils.isEmpty(v2))
        {
            error ("Haz dejado Campos Vacios");

        }
        else{
            int valor1=Integer.parseInt(v1);
            int valor2=Integer.parseInt(v2);
            int res=valor1-valor2;

            Operacion(String.valueOf(res));

        }


    }

    private void multiplicar() {

        String v1=numero1.getText().toString();
        String v2=numero2.getText().toString();

        if(TextUtils.isEmpty(v1)||TextUtils.isEmpty(v2))
        {
            error ("Haz dejado Campos Vacios");

        }
        else{
            int valor1=Integer.parseInt(v1);
            int valor2=Integer.parseInt(v2);
            int res=valor1*valor2;

            Operacion(String.valueOf(res));

        }
    }

    private void dividir() {

        String v1=numero1.getText().toString();
        String v2=numero2.getText().toString();


        if(TextUtils.isEmpty(v1)||TextUtils.isEmpty(v2))
        {
            error ("Haz dejado Campos Vacios");

        }
        else{
            double valor1=Integer.parseInt(v1);
            double valor2=Integer.parseInt(v2);
            double res=valor1/valor2;

            if(valor2==0){
                error("el Valor 2 debe ser diferente de 0");
            }
            else{
                Operacion(String.valueOf(res));

            }

        }

    }





    private void Operacion(String resu) {
        Intent resultado = new Intent(getApplicationContext(), resFunAritme.class);
        resultado.putExtra("Resultado",resu);
        startActivity(resultado);
    }

    private void error(String error) {
        Intent resultado = new Intent(getApplicationContext(), MainActivityerror.class);
        resultado.putExtra("Error",error);
        startActivity(resultado);
    }
}