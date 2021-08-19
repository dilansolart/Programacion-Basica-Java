import java.util.*;

public class Reto1 {
    public static void main(String[] args) throws Exception {
        String matter [] = {"historia", "literatura", "biologia"}; // materias
        String nameStudent [] = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"}; // nombres de estudiantes
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // n Numero de estudiantes
        Float datos[][] = new Float[n][4];
        
        // Creamos una mariz con los datos de los estudiantes:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                datos[i][j] = Float.parseFloat(input.next()); // cadena entrada de datos
            }
        }
        // Procesos:
        float sumExamen = 0.0f, mean = 0.0f, mayHis = 0.0f, stud = 0.0f;
        int cont = 0, conMat[] = {0, 0, 0};
        Float sumMat [] = {0.0f, 0.0f, 0.0f}; // Array promedio por materia genero masculino
        for (int i = 0; i < datos.length; i++) {
            sumExamen = sumExamen + datos[i][3];
            if (datos[i][3] > 2.5 && datos[i][3] <= 3.5) cont = cont + 1; // contador exámenes con calificación Regular
            if (datos[i][1] == 0.0) { 
                if (datos[i][2] == 1) {
                    sumMat[0] = sumMat[0] + datos[i][3];
                    conMat[0] = conMat[0] + 1;
                } else if (datos[i][2] == 2) {
                    sumMat[1] = sumMat[1] + datos[i][3];
                    conMat[1] = conMat[1] + 1;
                } else if (datos[i][2] == 3) {
                    sumMat[2] = sumMat[2] + datos[i][3];
                    conMat[2] = conMat[2] + 1;
                }
            }
        }
        
        float menor = sumMat[0]/conMat[0];
        int pos = 0;
        for (int j = 0; j < sumMat.length; j++) {
            if (sumMat[j]/conMat[j] < menor) {
                menor = sumMat[j]/conMat[j];
                pos = j;
            }
        }
        for (int k = 0; k < datos.length; k++) {
            if (datos[k][2] == 1.0 && datos[k][3] > mayHis) {
                mayHis = datos[k][3];
                stud = datos[k][0];
            }
            
        }
        
        // Salidas
        mean = sumExamen / n; // desempeño promedio
        
        System.out.println(String.format("%.2f", mean));
        System.out.println(cont);
        System.out.println(matter[pos]);
        System.out.println(nameStudent[Math.round(stud - 1)]);
        
        input.close();
    }
}
