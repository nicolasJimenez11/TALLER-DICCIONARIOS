import java.util.HashMap;
import java.util.Scanner;

public class Moneda {
    public static void main(String[] args) {
        HashMap<String, String> moneda = new HashMap<>();
        moneda.put("dolar", "4034 pesos colombianos");//el put sirve para agregar elementos al diccionario
        moneda.put("euro", "4400 pesos colombianos");
        moneda.put("libra", "5100 pesos colombianos");
        moneda.put("yen", "30 pesos colombianos");
        moneda.put("won", "3.5 pesos colombianos");
        moneda.put("yuan", "600 pesos colombianos");
        moneda.put("bitcoin", "20000000 pesos colombianos");
        moneda.put("peso mexicano", "200 pesos colombianos");
        moneda.put("real", "800 pesos colombianos");
        moneda.put("franco suizo", "4500 pesos colombianos");

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la moneda que desea convertir a pesos colombianos: ");
        String inputMoneda = sc.nextLine().toLowerCase();

        if (moneda.containsKey(inputMoneda)) {
            System.out.println("El valor de " + inputMoneda + " en pesos colombianos es: " + moneda.get(inputMoneda));
        } else {
            System.out.println("Moneda no encontrada. Por favor, ingrese una moneda válida.");
        }
    }
}