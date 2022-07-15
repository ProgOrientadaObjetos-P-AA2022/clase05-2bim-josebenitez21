/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.util.ArrayList;

/**
 *
 * @author M S I
 */
public class Principal2 {

    public static void main(String[] args) {

        String nombreArchivo = "movies.data";

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());

        System.out.println("---------------------------");

        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("154835");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());

        System.out.println("---------------------------");

        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("264854");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp4.obtenerUrl());

        GeneradorPeliculas[] lista = {gp, gp2, gp3, gp4};

        EscrituraSerializado archivo = new EscrituraSerializado(nombreArchivo);
        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);
            archivo.establecerSalida();
        }

//        ArrayList<GeneradorPeliculas> movies = new ArrayList<>();
//        movies.add(gp);
//        movies.add(gp2);
//        movies.add(gp3);
//        movies.add(gp4);
//
//        // establecer el valor del atributo registro
//        archivo.establecerRegistro(gp);
//        // establecer en el archivo el atributo del registro
//        archivo.establecerSalida();
//        archivo.establecerRegistro(gp2);
//        archivo.establecerSalida();
//        archivo.establecerRegistro(gp3);
//        archivo.establecerSalida();
//        archivo.establecerRegistro(gp4);
//        archivo.establecerSalida();
//        archivo.cerrarArchivo();
        archivo.cerrarArchivo();
        LecturaSerializado lectura = new LecturaSerializado(nombreArchivo);
        lectura.establecerListaPeliculas();
        System.out.println(lectura);

    }

}
