/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        //creamos el representante para posteriormente asociarlo al menor de 
        //edad
        TarjetaCredito tarCre = new TarjetaCredito("Visa", "41554863258",
                1500);

        MayorEdad representante = new MayorEdad("José", tarCre);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s\n"
                + "Codigo de tarjeta: %s\nCupo Maximo: %.2f\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCodigo(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCupoMaximo());

    }
}
