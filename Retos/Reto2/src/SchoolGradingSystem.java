import java.util.*;

public class SchoolGradingSystem {
    private Integer n;
    private Float datos[][];

    public void readData() {
        Scanner input = new Scanner (System.in);
        this.n = input.nextInt(); // n Numero de estudiantes
        this.datos = new Float[n][4];
        // Creamos una mariz con los datos de los estudiantes:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                datos[i][j] = Float.parseFloat(input.next()); // cadena entrada de datos
            }
        }
        input.close();
    }

    public Float question1() {
        float sumExamen = 0.0f;
        for (int i = 0; i < this.n; i++) {
            sumExamen = sumExamen + this.datos[i][3];
        }
        return sumExamen/this.n;
    }

    public Integer question2() {
        int cont = 0;
        for (int i = 0; i < this.n; i++) {
            if (this.datos[i][3] > 2.5 && this.datos[i][3] <= 3.5) cont = cont + 1;
        }
        return cont;
    }

    public String question3() {
        String matter [] = {"historia", "literatura", "biologia"}; // materias
        int conMat[] = {0, 0, 0}, pos = 0;;
        Float sumMat [] = {0.0f, 0.0f, 0.0f};
        for (int i = 0; i < this.n; i++) {
            if (this.datos[i][1] == 0.0) { 
                if (this.datos[i][2] == 1) {
                    sumMat[0] = sumMat[0] + this.datos[i][3];
                    conMat[0] = conMat[0] + 1;
                } else if (this.datos[i][2] == 2) {
                    sumMat[1] = sumMat[1] + this.datos[i][3];
                    conMat[1] = conMat[1] + 1;
                } else if (this.datos[i][2] == 3) {
                    sumMat[2] = sumMat[2] + this.datos[i][3];
                    conMat[2] = conMat[2] + 1;
                }
            }
        }

        float menor = sumMat[0]/conMat[0];
        for (int j = 0; j < sumMat.length; j++) {
            if (sumMat[j]/conMat[j] < menor) {
                menor = sumMat[j]/conMat[j];
                pos = j;
            }
        }
        return matter[pos];
    }
    
    public String question4() {
        String nameStudent [] = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"}; // nombres de estudiantes
        float mayHis = 0.0f, stud = 0.0f;
        for (int k = 0; k < this.datos.length; k++) {
            if (this.datos[k][2] == 1.0 && this.datos[k][3] > mayHis) {
                mayHis = this.datos[k][3];
                stud = this.datos[k][0];
            }
            
        }
        return nameStudent[Math.round(stud - 1)];
    }
}
