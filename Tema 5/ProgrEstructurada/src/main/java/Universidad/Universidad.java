package Universidad;

import Estudiante.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private static final int MAX_ESTUDIANTES = 100;

    private List<Estudiante> estudiantes = new ArrayList<>();

    public void añadirEstudiante (Estudiante estudiante) {
        if(estudiantes.size() < MAX_ESTUDIANTES) {
            estudiantes.add(estudiante);
        }
        else{
            System.out.println("No caben más!");
        }
    }

    public void buscarPorMatrícula(int matricula){
        for(Estudiante estudiante: estudiantes) {
            if(estudiante.getMatricula() == matricula) {
                System.out.println("Estudiante encontrado: " + estudiante);
                return;
            }
        }
    }

}
