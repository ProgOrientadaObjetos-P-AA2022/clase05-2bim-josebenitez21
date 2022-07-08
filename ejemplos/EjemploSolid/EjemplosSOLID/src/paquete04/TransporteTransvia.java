/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author M S I
 */
class TransporteTransvia extends Transporte {

    private String transvia;

    public void establecerTransvia(String n) {
        transvia = n;
    }

    public String obtenerTransvia() {
        return transvia;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 0.80 + 0.10;
    }

}
