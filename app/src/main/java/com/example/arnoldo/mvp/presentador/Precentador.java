package com.example.arnoldo.mvp.presentador;

import com.example.arnoldo.mvp.modelo.InterfazModelo;
import com.example.arnoldo.mvp.modelo.Modelo;
import com.example.arnoldo.mvp.vista.InterfazVista;
import com.example.arnoldo.mvp.vista.Vista;

/**
 * Created by arnoldo on 15/05/18.
 */

public class Precentador implements InterfazPresentador {//implementar a la clase su interfaz
    //correspondinte

   Vista vista;//creamos la variable para guardar el dato que venga de la vista
   InterfazModelo modelo;//esta es  la variable donde se guarda lo que le mantdaremos al modelo

    public Precentador(Vista vista){//constructor que espera el dato de la vista
        this.vista=vista;//indicamos que el dato enviado de la vista se guardara en la variable creada
        modelo=new Modelo(this);//instanciamos un nuevo modelo

    }

    @Override
    public void cambiarNumero(String numero) {
        //al metodo cambiar numero que esta esperando dicho parametro desde la vista
      modelo.cambiarNumero(numero);//le asignamos a la interfaz el metodo y el dato que espera en su metodo
    }

    @Override
    public void numeroCambiado(String numero) {//metodo utilizado para mostrar el cambio asignado
      vista.numeroCambiado(numero);//le decimos a la interfas de la vista con este metodo que ya se
        //realizo el cambio
    }
}
