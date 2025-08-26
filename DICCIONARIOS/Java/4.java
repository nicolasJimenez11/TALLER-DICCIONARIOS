import java.util.*;

/**
 * Ejercicio 4 — Conversión de fecha (Java)
 * Convierte 'dd/mm/aaaa' a 'dd de <mes> de aaaa' usando un arreglo de meses.
 */
public class FormatoFecha {
    public static void main(String[] args) {
        String[] meses = {"", "enero","febrero","marzo","abril","mayo","junio",
                          "julio","agosto","septiembre","octubre","noviembre","diciembre"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine().trim();
        try {
            String[] p = fecha.split("/");
            int d = Integer.parseInt(p[0]);
            int m = Integer.parseInt(p[1]);
            String a = p[2];
            if (m >= 1 && m <= 12) {
                System.out.println(d + " de " + meses[m] + " de " + a);
            } else {
                System.out.println("Mes inválido");
            }
        } catch (Exception e) {
            System.out.println("Formato inválido. Ejemplo: 24/08/2025");
        }
    }
}
