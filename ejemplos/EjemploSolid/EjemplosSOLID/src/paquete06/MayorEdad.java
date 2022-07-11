/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona {

    //private String tarjeta;
    private TarjetaCredito tarjeta;
    //private TarjetaCredito tarjetaC;

    public MayorEdad(String n, TarjetaCredito tar) {
        super(n);
        tarjeta = tar;
    }

    public MayorEdad(TarjetaCredito a, String n) {
        super(n);
        tarjeta = a;
    }
    

    public void establecerTarjeta(TarjetaCredito n) {
        tarjeta = n;
    }
//
//    public void establecerTarjetaC(TarjetaCredito a) {
//        tarjetaC = a;
//    }
//
//    public TarjetaCredito obtenerTarjetaC() {
//        return tarjetaC;
//    }

    public TarjetaCredito obtenerTarjeta() {
        return tarjeta;
    }

}
