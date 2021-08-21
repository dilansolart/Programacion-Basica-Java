public class GradingSystem {
    protected Integer n;
    protected Float datos[][];
    
    // Metodos para cada respuesta al reto:
    public float stat1() {
        float sumExamen = 0.0f;
        for (int i = 0; i < this.n; i++) {
            sumExamen = sumExamen + this.datos[i][3];
        }
        return sumExamen/this.n;
    }

    public int stat2() {
        int cont = 0;
        for (int i = 0; i < this.n; i++) {
            if (this.datos[i][3] > 2.5 && this.datos[i][3] <= 3.5) cont = cont + 1;
        }
        return cont;
    }

    public String stat3() {
        String matter [] = {"historia", "literatura", "biologia"}; // materias
        int conMat[] = {0, 0, 0}, pos = -1;;
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
        if (pos == -1) return "-1";
        return matter[pos];
    }
    public String stat4() {
        String nameStudent [] = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"}; // nombres de estudiantes
        float mayHis = 0.0f, stud = 0.0f;
        for (int k = 0; k < this.datos.length; k++) {
            if (this.datos[k][2] == 1.0 && this.datos[k][3] > mayHis) {
                mayHis = this.datos[k][3];
                stud = this.datos[k][0];
            }
            
        }
        if (stud < 1 || stud > 6) return "-1";
        return nameStudent[Math.round(stud - 1)];
    }
}
