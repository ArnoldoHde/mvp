package com.example.arnoldo.mvp.modelo;

import com.example.arnoldo.mvp.presentador.InterfazPresentador;
import com.example.arnoldo.mvp.vista.Vista;

/**
 * Created by arnoldo on 15/05/18.
 */

public class Modelo implements InterfazModelo {
 InterfazPresentador presentador;
 int numeroStatico=20;//bariable que me permite saber que siempre empezara en 20

 //creamos un costructor
    public Modelo(InterfazPresentador presentador){//esperamos de la interfaz del presentador
        //un parametro tipo presentador
        this.presentador=presentador;


    }
 @Override
    public void cambiarNumero(String  numero) {
        int numeroModificado;
        switch (numero){//
            case "mas":
                numeroModificado=numeroStatico+1;//opreacion del incremento
                numeroStatico=numeroModificado;//Especifico que ya no vale 20
                //Convierto el numero a estring y se lo envio al presentaror
                presentador.numeroCambiado(String.valueOf(numeroModificado));
                //agrego el value of por que el metodo espera un parametro de tipo String y no entero
                break;
            case "menos":
                numeroModificado=numeroStatico-1;
                numeroStatico=numeroModificado;
                presentador.numeroCambiado(String.valueOf(numeroModificado));
                break;
        }

    }
}
