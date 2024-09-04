import java.util.Scanner;

public class CalcularPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar los cinco valores de la lista de compras
        double[] valores = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingrese el valor %d de la lista de compras: ", i + 1);
            valores[i] = scanner.nextDouble();
            total += valores[i];
        }

        // Determinar el tipo de pago según el total
        String tipoDePago;

        if (total <= 10000) {
            tipoDePago = "en efectivo";
        } else if (total <= 20000) {
            tipoDePago = "con tarjeta";
        } else {
            tipoDePago = "con cheque";
        }

        // Mostrar el resultado
        System.out.printf("%s, el total de su lista de compras es: $%.2f%n", nombre, total);
        System.out.printf("El pago se realizará %s.%n", tipoDePago);

        scanner.close();
    }
}

