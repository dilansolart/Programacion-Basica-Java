import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre = "Dilan Solar";
        int edad = 27;
        Double estatura = 1.70;
        String num = "5";
        int number = Integer.parseInt(num);
        System.out.println(number);
        System.out.println("Hello, World!");
        System.out.println("Hola!. Mi nombre es: " + nombre + " tengo " + edad + " de edad y mido " + estatura);
        System.out.println(String.format("Hola!. Mi nombre es: %s tengo %s de edad y mido %s", nombre, edad, estatura));
        
        //Lectura de datos
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese edad: ");
        int edadUser = leer.nextInt();
        System.out.println(edadUser);

        
        //Condicionales
        if (edadUser >= 19) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
    }
}
