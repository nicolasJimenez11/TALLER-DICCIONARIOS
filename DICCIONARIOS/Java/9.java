package ejercicio5;

import java.util.HashMap;   // Importamos HashMap, estructura clave-valor (diccionario)
import java.util.Map;       // Interfaz general Map
import java.util.Scanner;   // Para leer datos del usuario desde consola

public class Facturas {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer del teclado
	        Map<String, Integer> facturas = new HashMap<>();  // Diccionario: clave=numero, valor=costo (int)
	        int cobrado = 0;  // Total ya cobrado

	        while (true) {   // Bucle principal
	            System.out.println("\nOpciones: 1. Añadir  2. Pagar  3. Terminar");
	            System.out.print("Elija una opcion: ");
	            String op = sc.nextLine().trim();   // se lee la opcion

	            switch (op) {  // Se evalua la opcion ingresada
	                case "1": {   // Añadir factura
	                    System.out.print("Numero de factura: "); // Leemos el numero de factura
	                    String numero = sc.nextLine().trim(); 

	                    if (facturas.containsKey(numero)) {
	                        System.out.println("Esa factura ya existe.");  // Si ya existe no se la añade
	                    } else {
	                        System.out.print("Costo de la factura: ");
	                        try {
	                            int costo = Integer.parseInt(sc.nextLine().trim());
	                            facturas.put(numero, costo); // Guardamos en el diccionario
	                            System.out.println("Factura " + numero + " añadida por " + costo + ".");
	                        } catch (NumberFormatException e) {   // Si el valor no es numero entero
	                            System.out.println("Costo invalido. No se añadio la factura.");
	                        }
	                    }
	                    break;
	                }
	                case "2": {   // Pagar factura
	                    System.out.print("Numero de factura a pagar: ");
	                    String numero = sc.nextLine().trim();

	                    Integer importe = facturas.remove(numero);  // Eliminamos la factura y obtenemos su valor
	                    if (importe != null) {   // Si la factura existia
	                        cobrado += importe;  // Sumamos al total cobrado
	                        System.out.println("Factura " + numero + " pagada por " + importe + ".");
	                    } else {
	                        System.out.println("No existe esa factura.");
	                    }
	                    break;
	                }
	                case "3":    // Terminar el programa
	                    int pendienteFinal = sumaValores(facturas);  // se calcula lo pendiente
	                    System.out.println("\nTotal cobrado: " + cobrado +
	                                       " | Pendiente final: " + pendienteFinal);
	                    sc.close();   // Cerramos el Scanner
	                    return;
	                default:  // Si la opcion no es valida
	                    System.out.println("Opcion no valida.");
	                    continue; // vuelve a mostrar el menu
	            }

	            // Mostrar siempre los totales despues de cada operacion valida
	            int pendiente = sumaValores(facturas);
	            System.out.println("Cobrado hasta el momento: " + cobrado);
	            System.out.println("Pendiente de cobro:       " + pendiente);
	        }
	    }

	  // Funcion auxiliar que suma todos los valores del diccionario
	    private static int sumaValores(Map<String, Integer> mapa) {
	        int s = 0;
	        for (int v : mapa.values()) s += v;  // Recorremos todos los valores y sumamos
	        return s;
	    }
}
