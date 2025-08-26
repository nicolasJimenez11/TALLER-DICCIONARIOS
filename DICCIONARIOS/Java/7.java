import java.util.*;

/**
 * Ejercicio 7 — Cesta de la compra (Java)
 * Registra pares articulo→precio hasta que el usuario escriba 'fin'.
 * Imprime la lista y el total. Usa LinkedHashMap para conservar el orden de inserción.
 */
public class CestaCompra {
    public static void main(String[] args) {
        Map<String, Double> cesta = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese artículo (o 'fin' para terminar): ");
            String articulo = sc.nextLine().trim();
            if (articulo.equalsIgnoreCase("fin")) break;
            System.out.print("Ingrese precio: ");
            try {
                double precio = Double.parseDouble(sc.nextLine().trim());
                cesta.put(articulo, precio); // actualiza si ya existía
            } catch (NumberFormatException e) {
                System.out.println("Precio inválido. Intente de nuevo.");
            }
        }
        System.out.println("\nLista de la compra");
        double total = 0;
        for (Map.Entry<String, Double> e : cesta.entrySet()) {
            System.out.println(e.getKey() + ": $" + String.format("%.2f", e.getValue()));
            total += e.getValue();
        }
        System.out.println("Total coste: $" + String.format("%.2f", total));
    }
}
