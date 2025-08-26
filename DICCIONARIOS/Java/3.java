import java.util.*;

/**
 * Ejercicio 3 — Precios de repuestos de carro (Java)
 * Guarda un catálogo en un HashMap y calcula el total para un repuesto y cantidad dados.
 * Complejidad: búsquedas promedio O(1) por clave.
 */
public class Repuestos {
    public static void main(String[] args) {
        Map<String, Double> precios = new HashMap<>();
        precios.put("Bujia", 1.40);
        precios.put("Pastillas de freno", 5.80);
        precios.put("Radiador", 300.50);
        precios.put("Rodamiento", 10.70);

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el nombre del repuesto: ");
            String repuesto = sc.nextLine().trim();
            System.out.print("Ingrese la cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine().trim());

            Double precio = precios.get(repuesto);
            if (precio == null) {
                System.out.println("El repuesto no está disponible en el diccionario.");
            } else {
                double total = precio * cantidad;
                System.out.printf("El precio de %d %s(s) es: $%.2f%n", cantidad, repuesto, total);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida: la cantidad debe ser un entero.");
        }
    }
}
