import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String name = "Dilan Solar";
        // int edad = 27;
        // float estatura = 1.70002f;
        // // Create format string
        // System.out.println(String.format("Me llamo %s", name));
        // System.out.println(String.format("Mi edad es %s", edad));
        // System.out.println(String.format("Mido %.2f ", estatura));

        // Lectura de datos
        Scanner entrada = new Scanner (System.in);
        // System.out.print("Ingrese su peso: ");
        // float peso = entrada.nextFloat();
        // System.out.println(peso);
        // entrada.close();

        // Ejercicio par
        System.out.print("Digite Cant # pares que desea ver: ");
        int cantn = entrada.nextInt();
        for (int i = 2; i <= cantn * 2; i += 2) {
            System.out.print(String.format("%d  ", i));
        }
        entrada.close();

    }
}

