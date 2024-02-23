package org.example;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Libro> coleccion;

    public Libreria(){
        this.coleccion = new ArrayList<Libro>();
    }

    public void añadirLibro(Libro libro) {
        coleccion.add(libro);
    }

    public void buscarporAutor(String autor) {
        for(Libro libro: coleccion) {
                System.out.println(libro);
        }
    }
}
