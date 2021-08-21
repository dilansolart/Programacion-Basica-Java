public class GradingSystem {
    protected Student [][] Estudiante;
    protected Float datos[][];
    Student Estudiante1 = new Student ("0.0","0.0","0.0","0.0");
    
    // Metodos para cada respuesta al reto:
    public float stat1() {
        float sumExamen = 0.0f;
        for (int i = 0; i < Estudiante.length; i++) {
            sumExamen += Estudiante[i][3].getNota();
        }
        return sumExamen/Estudiantes.length;
    }

    public int stat2() {
        int cont = 0;
        for (int i = 0; i < Estudiante.length; i++) {
            if (Estudiante[i][3].getNota() > 2.5 && Estudiante[i][3].getNota() <= 3.5) cont = cont + 1;
        }
        return cont;
    }

    public String stat3() {
        String matter [] = {"historia", "literatura", "biologia"}; // materias
        int conMat[] = {0, 0, 0}, pos = 0;
        Float sumMat [] = {0.0f, 0.0f, 0.0f};
        for (int i = 0; i < Estudiante.length; i++) {
            if (Estudiante[i][1].getGenero() == 0.0) { 
                if (Estudiante[i][2].getMateria() == 1) {
                    sumMat[0] = sumMat[0] + Estudiante[i][3].getNota();
                    conMat[0] = conMat[0] + 1;
                } else if (Estudiante[i][2].getMateria() == 2) {
                    sumMat[1] = sumMat[1] + Estudiante[i][3].getNota();
                    conMat[1] = conMat[1] + 1;
                } else if (Estudiante[i][2].getMateria() == 3) {
                    sumMat[2] = sumMat[2] + Estudiante[i][3].getNota();
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
    public String stat4() {
        String nameStudent [] = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"}; // nombres de estudiantes
        float mayHis = 0.0f, stud = 0.0f;
        for (int k = 0; k < Estudiante.length; k++) {
            if (Estudiante[k][2].getMateria() == 1.0 && Estudiante[k][3].getNota() > mayHis) {
                mayHis = Estudiante[k][3].getNota();
                stud = Estudiante[k][0].getNombre();
            }
            
        }
        return nameStudent[Math.round(stud - 1)];
    }
}
