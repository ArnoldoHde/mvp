package com.example.arnoldo.mvp.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.arnoldo.mvp.presentador.InterfazPresentador;
import com.example.arnoldo.mvp.presentador.Precentador;
import com.example.arnoldo.mvp.R;

public class Vista extends AppCompatActivity implements InterfazVista {

    Button btnMas,btnMenos;
    TextView tvMostrar;
    InterfazPresentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMostrar=findViewById(R.id.tvNumero);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        presentador= new Precentador(this);

    }
    public void selected(View v){
      String seleccion;//variable que sirve para saver que obcion precione
       switch (v.getId()){
           case R.id.btnMas:
               seleccion="mas";
       presentador.cambiarNumero(seleccion);//mando al presentador la bocion elegida
       break;
           case R.id.btnMenos:
               seleccion="menos";
               presentador.cambiarNumero(seleccion);
               break;
       }
    }



    @Override
    public void numeroCambiado(String numero) {
       tvMostrar.setText(numero);
    }
}
