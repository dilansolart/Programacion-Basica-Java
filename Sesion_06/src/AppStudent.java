public class AppStudent {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Dilan", 4.5, 4.1, 5.0);
        Student student2 = new Student("David", 4.1, 3.1, 1.0); 
        Student student3 = new Student("DiDa", 4.5, 3.0, 4.0); 
        Student student4 = new Student("D2ST", 4.8, 2.1, 3.0); 

        System.out.printf("El estudiante %s, con codigo %d Su promedio es de %.2f%n%n", student1.getNombre(), student1.getCodigo(), student1.promedio());
        System.out.printf("El estudiante %s, con codigo %d Su promedio es de %.2f%n%n", student2.getNombre(), student2.getCodigo(), student2.promedio());
        System.out.printf("El estudiante %s, con codigo %d Su promedio es de %.2f%n%n", student3.getNombre(), student3.getCodigo(), student3.promedio());
        System.out.printf("El estudiante %s, con codigo %d Su promedio es de %.2f%n%n", student4.getNombre(), student4.getCodigo(), student4.promedio());
        System.out.println("El codigo del proximo estudiante es " + Student.getConsecutivo());
    }
}