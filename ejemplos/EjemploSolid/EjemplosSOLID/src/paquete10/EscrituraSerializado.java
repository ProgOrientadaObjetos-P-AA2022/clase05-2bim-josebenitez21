/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author M S I
 */
public class EscrituraSerializado {

    private String nombreArchivo;
    private ObjectOutputStream salida; // envía los datos a un archivo
    private GeneradorPeliculas movies;
    private ArrayList<GeneradorPeliculas> lista;

    public EscrituraSerializado(String nombreArc) {
        nombreArchivo = nombreArc;
        establecerLista(); // obtener los valores (objetos)
        // que tiene el archivo.
        // System.out.println(obtenerListaProfesores().size());
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerRegistro(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }
    // agrega moviess al archivo

    public void establecerRegistro(GeneradorPeliculas p) {
        movies = p;
    }

    public void establecerSalida() {
        try {
            salida.writeObject(movies); // envía el movies como salida
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }

    // en el atributo listaProfesores obtenemos los moviess 
    // del archivo
    public void establecerLista() {
        LecturaSerializado l = new LecturaSerializado(obtenerNombreArchivo());
        l.establecerListaPeliculas();
        lista = l.obtenerListaPeliculas();
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public ArrayList<GeneradorPeliculas> obtenerLista() {
        return lista;
    }

    public ObjectOutputStream obtenerSalida() {
        return salida;
    }

    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");

        } // fin de catch
    }

}
