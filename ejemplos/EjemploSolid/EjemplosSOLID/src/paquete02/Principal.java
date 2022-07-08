/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Persona e1 = new Persona("Alexander", 8);
        Persona e2 = new Persona("Juan", 7);
        Persona e3 = new Persona("Camila", 9);
        Persona e4 = new Persona("Romina", 8);
        Persona e5 = new Persona("Alejandra", 10);
        ArrayList<Persona> estudiantesData = new ArrayList<>();
        estudiantesData.add(e1);
        estudiantesData.add(e2);
        estudiantesData.add(e3);
        estudiantesData.add(e4);
        estudiantesData.add(e5);

        OperacionesEstudiantes op = new OperacionesEstudiantes();
        op.establecerEstudiante(estudiantesData);
        op.establecerPromedioEdades();
        System.out.printf("%s\n", op);
        
    }
}
