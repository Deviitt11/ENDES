package org.example;

import java.util.ArrayList;

/**
 * Clase Concesionario que representa a un concesionario (como bien explica su nombre)
 * @author David Collados
 * @since 2024-02-05
 * @version 1.0
 */
public class Concesionario {

    /**
     * ArrayList de tipo Auto, para almacenar objetos de tipo Auto
     * (representando coches)
     */
    private ArrayList<Auto> autos;

    /**
     * Constructor de la clase Concesionario
     */
    public Concesionario() {
        autos = new ArrayList<>();
    }

    /**
     * @param auto
     * Recibe como parámetro el objeto auto de tipo Auto
     * Este método añade un auto al ArrayList
     */
    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

    /**
     * @return devuelve los autos que se encuentran en la lista
     */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

    /**
     * Bucle for each para imprimir cada elemento del ArrayList autos
     */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}


