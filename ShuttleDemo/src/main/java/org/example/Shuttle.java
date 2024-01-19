package org.example;

public class Shuttle {
    private int numEmpAlojamiento;
    private int numEmpFabrik;

    public Shuttle(int numEmpAlojamiento) {
        if(numEmpAlojamiento <= 0) {
            throw new IllegalArgumentException("Num debe ser >= 0");
        }

        this.numEmpAlojamiento = numEmpAlojamiento;
        numEmpFabrik = 0;
    }

    public int getNumEmpAlojamiento() {
        return numEmpAlojamiento;
    }

    public void setNumEmpAlojamiento(int numEmpAlojamiento) {
        this.numEmpAlojamiento = numEmpAlojamiento;
    }

    public int getNumEmpFabrik() {
        return numEmpFabrik;
    }

    public void setNumEmpFabrik(int numEmpFabrik) {
        this.numEmpFabrik = numEmpFabrik;
    }

    public String convocar(int convocados){
        if(convocados <= 0 || convocados > numEmpAlojamiento) {
            return "Operación no realizada";
        }
        numEmpAlojamiento -= convocados;
        numEmpFabrik += convocados;
        return "Operación realizada";
    }

    public String liberar(int liberados) {
        if(liberados > 0 && liberados <= numEmpFabrik ) {
            numEmpAlojamiento += liberados;
            numEmpFabrik -= liberados;
            return "Operación realizada";
        }
        return "Operación no realizada";
    }
}
