import java.util.HashMap;
import java.util.Scanner;

public class ClientesEmpresa {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Object>> clientes = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Añadir cliente\n2. Eliminar cliente\n3. Mostrar cliente\n4. Listar todos los clientes\n5. Listar clientes preferentes\n6. Terminar");
            System.out.print("Seleccione una opción: ");
            String opcion = sc.nextLine();

            if (opcion.equals("1")) {
                System.out.print("NIF: ");
                String nif = sc.nextLine();
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Dirección: ");
                String direccion = sc.nextLine();
                System.out.print("Teléfono: ");
                String telefono = sc.nextLine();
                System.out.print("Correo: ");
                String correo = sc.nextLine();
                System.out.print("¿Es cliente preferente? (s/n): ");
                boolean preferente = sc.nextLine().equalsIgnoreCase("s");

                HashMap<String, Object> datos = new HashMap<>();
                datos.put("nombre", nombre);
                datos.put("direccion", direccion);
                datos.put("telefono", telefono);
                datos.put("correo", correo);
                datos.put("preferente", preferente);

                clientes.put(nif, datos);
            } else if (opcion.equals("2")) {
                System.out.print("NIF del cliente a eliminar: ");
                String nif = sc.nextLine();
                if (clientes.containsKey(nif)) {
                    clientes.remove(nif);
                    System.out.println("Cliente eliminado.");
                } else {
                    System.out.println("Cliente no encontrado.");
                }
            } else if (opcion.equals("3")) {
                System.out.print("NIF del cliente a mostrar: ");
                String nif = sc.nextLine();
                if (clientes.containsKey(nif)) {
                    System.out.println(clientes.get(nif));
                } else {
                    System.out.println("Cliente no encontrado.");
                }
            } else if (opcion.equals("4")) {
                for (String nif : clientes.keySet()) {
                    System.out.println("NIF: " + nif + ", Nombre: " + clientes.get(nif).get("nombre"));
                }
            } else if (opcion.equals("5")) {
                for (String nif : clientes.keySet()) {
                    if ((boolean)clientes.get(nif).get("preferente")) {
                        System.out.println("NIF: " + nif + ", Nombre: " + clientes.get(nif).get("nombre"));
                    }
                }
            } else if (opcion.equals("6")) {
                System.out.println("Programa terminado.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }
}