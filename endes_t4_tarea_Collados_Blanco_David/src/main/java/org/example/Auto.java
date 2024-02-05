package org.example;

import java.util.ArrayList;

/**
 * Clase Auto que representa a un coche
 * @author David Collados
 * @since 2024-02-05
 * @version 1.0
 */
public class Auto {

    /**
     * Atributo de tipo String para la marca del coche
     */
    private String marca;

    /**
     * Atributo de tipo String para el modelo del coche
     */
    private String modelo;

    /**
     * Constructor de la clase Auto
     * @param marca
     * @param modelo
     * Recibe como parámetros la marca y el modelo
     */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return devuelve la marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca
     * Recibe como parámetro la marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return devuelve el modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo
     * Recibe como parámetro el modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return devuelve un toString con texto concatenado con los atributos del coche
     */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}