package ejercicio5;

//librerias necesarias para el diccionario

import java.util.HashMap;
import java.util.Map;

public class Creditos {
	
    public static void main(String[] args) {
        // Creacion de diccionario con asignaturas y creditos
    	
        Map<String, Integer> cursos = new HashMap<>();
        cursos.put("Matematicas", 6);
        cursos.put("Fisica", 4);
        cursos.put("Quimica", 5);

        int totalCreditos = 0;

        // Muestrar los creditos de cada asignatura
        for (String asignatura : cursos.keySet()) {
            int creditos = cursos.get(asignatura);
            System.out.println(asignatura + " tiene " + creditos + " creditos");
            totalCreditos += creditos;
        }


        // Muestrar el total de creditos
        System.out.println("El numero total de creditos del curso es: " + totalCreditos);
    }

}

