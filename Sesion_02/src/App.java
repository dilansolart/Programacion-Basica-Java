import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Arreglos
        // Ej 1
        // int B [] = new int[4];
        // B [0] = 5;
        // B [1] = 7;
        // B [2] = 2;
        // B [3] = 1;
        // System.out.println(B[0]);

        // Ej 2
        // int X[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // for (int i = 0; i < X.length; i++) System.out.println(X[i]);

        // Scanner input = new Scanner(System.in);
        // System.out.print("Ingrese tamaño del vector ..> ");
        // int t = input.nextInt();
        // Integer vector[] = new Integer [t];

        // for (int i = 0; i < t; i++) {
        //     System.out.print(String.format("Ingrese un valor en la posicion %d --> ", i));
        //     vector[i] = input.nextInt();
        // }

        // for (int i = 0; i < vector.length; i++) System.out.print(String.format("%d | ", vector[i]));

        // int suma = 0;
        // for (int i = 0; i < vector.length; i++) suma = suma + vector[i];

        // System.out.println();
        // System.out.println(String.format("La suma es --> %d", suma));

        // // Forma Primitiva
        // int mayor = vector[0], menor = vector[0];
        // for (int i = 0; i < vector.length; i++) if (vector[i] > mayor) mayor = vector[i];

        // for (int j = 0; j < vector.length; j++) if (vector[j] < menor) menor = vector[j];

        // System.out.println(String.format("El Mayor es --> %d", mayor));
        // System.out.println(String.format("El menor es --> %d", menor));

        // // Forma colection
        // int mayor2 = Collections.max(Arrays.asList(vector));
        // int menor2 = Collections.min(Arrays.asList(vector));
    
        // System.out.println(String.format("El Mayor 2 es --> %d", mayor2));
        // System.out.println(String.format("El menor 2 es  --> %d", menor2));

        // // Forma other
        // Arrays.sort(vector);
        // System.out.println(String.format("Mayor forma 3 --> %d", vector[vector.length - 1]));
        // System.out.println(String.format("Menor forma 3 --> %d", vector[0]));
        
        //input.close();
    
        // matrices
        int matriz[][] = {{1, 2, 3}, {6, 5, 4}};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();



    }
}