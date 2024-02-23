package org.example;

import Estudiante.Estudiante;
import Universidad.Universidad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Universidad uni = new Universidad();

        uni.añadirEstudiante(new Estudiante(777, "Cancio", "Informática"));
        uni.añadirEstudiante(new Estudiante(333, "Nano", "Mecánica"));

        uni.buscarPorMatrícula(666);
        uni.buscarPorMatrícula(777);
    }
}