/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author M S I
 */
class TransporteTransvia {

    private String transvia;
    private double tarifa;

    public void establecerTransvia(String n) {
        transvia = n;
    }

    public void establecerTarifa() {
        tarifa = 0.80 + (0.80 * 0.1);;
    }

    public String obtenerTransvia() {
        return transvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
