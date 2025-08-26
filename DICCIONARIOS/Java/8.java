import java.util.HashMap;
import java.util.Scanner;

public class Traductor {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las palabras y traducciones (ejemplo: casa:house,perro:dog,gato:cat): ");
        String entrada = sc.nextLine();
        String[] pares = entrada.split(",");
        for (String par : pares) {
            String[] partes = par.split(":");
            if (partes.length == 2) {
                diccionario.put(partes[0].trim(), partes[1].trim());
            }
        }

        System.out.print("Ingrese una frase en español: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        StringBuilder traduccion = new StringBuilder();
        for (String palabra : palabras) {
            if (diccionario.containsKey(palabra)) {
                traduccion.append(diccionario.get(palabra));
            } else {
                traduccion.append(palabra);
            }
            traduccion.append(" ");
        }
        System.out.println("Traducción: " + traduccion.toString().trim());
    }
}