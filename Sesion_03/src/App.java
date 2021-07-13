import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        int fila, columna;
        System.out.print("Digite el numero de filas de la matriz --> ");
        fila = input.nextInt();
        System.out.print("Digite el numero de columnas de la matriz --> ");
        columna = input.nextInt();
        int matriz [][] = new int[fila][columna];

        // Matriz con interaccion del usuario
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println(String.format("Ingrese el elemento para la posicion [%d][%d] -->", i, j));
                matriz[i][j] = input.nextInt();
            }
        }
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                System.out.print("\t" + matriz[k][l]);
            }
            System.out.println();
        }
        System.out.println();
        
        // Matriz aleatoria
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                System.out.print("\t" + matriz[k][l]);
            }
            System.out.println();
        }
        input.close();
    }
}
