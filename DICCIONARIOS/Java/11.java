import java.util.*;

/**
 * Ejercicio 11 — Directorio de clientes (Java)
 * Convierte una cadena con cabecera y filas separadas por \n y ';'
 * en un mapa: cedula -> {nombre, email, teléfono, descuento}.
 */
public class DirectorioClientes {
    public static Map<String, Map<String, String>> parseDirectorio(String cadena) {
        // Normalizar: reemplaza literales "\n" por saltos reales
        String text = cadena.replace("\\n", "\n").trim();
        String[] lines = text.split("\r?\n");
        List<String> limpias = new ArrayList<>();
        for (String ln : lines) if (ln != null && !ln.trim().isEmpty()) limpias.add(ln.trim());
        Map<String, Map<String, String>> out = new LinkedHashMap<>();
        if (limpias.isEmpty()) return out;

        // Cabecera
        String[] header = Arrays.stream(limpias.get(0).split(";"))
                                .map(String::trim).toArray(String[]::new);

        // Filas
        for (int i = 1; i < limpias.size(); i++) {
            String[] partes = Arrays.stream(limpias.get(i).split(";"))
                                    .map(String::trim).toArray(String[]::new);
            if (partes.length != header.length) continue; // robustez ante filas defectuosas

            Map<String, String> fila = new LinkedHashMap<>();
            for (int c = 0; c < header.length; c++) {
                fila.put(header[c], partes[c]);
            }
            String ced = fila.getOrDefault("cedula", partes[0]);
            fila.remove("cedula"); // evitar repetir la clave dentro del submapa
            out.put(ced, fila);
        }
        return out;
    }

    public static void main(String[] args) {
        String directorio =
            "cedula;nombre;email;teléfono;descuento\n" +
            "1001234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n" +
            "999888777K;Ana Pérez;ana.perez@mail.com;3001112222;5\n" +
            "555444333J;Carlos Ruiz;c.ruiz@mail.com;3175556666;0\n";

        Map<String, Map<String, String>> res = parseDirectorio(directorio);
        System.out.println(res);
    }
}
