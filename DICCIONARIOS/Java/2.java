import java.util.HashMap;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        HashMap<String, String> usuario = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        usuario.put("nombre", sc.nextLine());

        System.out.print("Ingrese su edad: ");
        usuario.put("edad", sc.nextLine());

        System.out.print("Ingrese su dirección: ");
        usuario.put("direccion", sc.nextLine());

        System.out.print("Ingrese su número de teléfono: ");
        usuario.put("telefono", sc.nextLine());

        System.out.println(usuario.get("nombre") + " tiene " + usuario.get("edad") +
                " años, vive en " + usuario.get("direccion") +
                " y su número de teléfono es " + usuario.get("telefono") + ".");
    }