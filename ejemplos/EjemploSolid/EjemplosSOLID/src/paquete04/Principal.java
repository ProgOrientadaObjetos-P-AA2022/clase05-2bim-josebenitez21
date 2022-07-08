/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

// Cambios - 8 - julio - 2022 
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();

        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        TransporteTransvia transvia = new TransporteTransvia();
        transvia.establecerTransvia("Loja Movement");
        transvia.establecerTarifa();

        TiposTransporte tipos = new TiposTransporte();
//        tipos.establecerTransporteBus(bus);
//        tipos.establecerTransporteTaxi(taxi);
//        tipos.establecerPromedioTarifas();
        ArrayList<Transporte> transporteVarios = new ArrayList<>();
        transporteVarios.add(bus);
        transporteVarios.add(taxi);
        transporteVarios.add(transvia);
        tipos.establecerTransportes(transporteVarios);
        tipos.establecerPromedioTarifas();
        System.out.printf("Promedio de Tarifas: %.2f",
                tipos.obtenerPromedioTarifas());

    }
}
