public class App {
    public static void main(String[] args) throws Exception {
        boolean auxtrans = Trabajador.auxTransp(1000000);
        System.out.println("Salario Basico: " + Trabajador.getSalariobasico());
        System.out.println("Requiere auxilio "+ auxtrans);
    }
}
