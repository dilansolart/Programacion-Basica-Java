public class SchoolGradingSystem extends GradingSystem{
    
    //read-data - lectura de información
    public void loadData(int n,String [] vector){
        Estudiante = new Student[n][4];

        for (int i = 0; i < n; i++) 
        {
            String v[] = vector[i].split(" ");
            for (int j = 0; j < 4; j++) {
            String nombre=v[0];
            String genero=v[1];
            String materia=v[2];
            String nota=v[3];
            Estudiante[i][j]=new Student(nombre,genero,materia,nota);
            }
        }
    }

}