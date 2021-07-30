public class App {
    public static void main(String[] args) throws Exception {
        Telefono array[] = new Telefono[3];
        array[0] = new Motoro("Android", "model2", "black", "2GB");
        array[1] = new Blux("Android10", "model3", "red", "1GB");
        array[2] = new Motoro("Android11", "model4", "redBlue", "1.5GB");
        for(Telefono i: array) {
            if (i instanceof Telefono) {
                System.out.println("Si es una instancia de telefono");
            } else System.out.println("No es una instancia de telefono");
        }
    }
}
