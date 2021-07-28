public class App {
    public static void main(String[] args) throws Exception {
        // Ejemplo1 e1 = new Ejemplo1();
        // System.out.println(e1.sumar(5, 8));
        // System.out.println(e1.sumar(1, 3, 5));
        // System.out.println(e1.sumar(0.1f, 3.9f, 4.5f));
        // Avion a1 = new Avion();
        // AvionGuerra ag1 = new AvionGuerra();
        // System.out.println(a1.volar());
        // System.out.println(ag1.volar());
        Suma s1 = new Suma();
        s1.perdirDatos();
        s1.operacion();
        System.out.println(s1.mostrarResultado());
    }
}
