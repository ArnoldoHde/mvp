package com.example.arnoldo.mvp.presentador;

/**
 * Created by arnoldo on 15/05/18.
 */

public interface InterfazPresentador {
    void cambiarNumero(String numero);// este me servira para recibir el cambio del nuevo numero

    void numeroCambiado(String numero);
    //sera el encargado de decirle al precentador que el numero a sido cambiado
}
