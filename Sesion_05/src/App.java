public class App {
    public static void main(String[] args) throws Exception {
        Computer C1 = new Computer();
        C1.Color = "Black";
        C1.Trademark = "HP";
        C1.MemoryRam = "12GB";
        C1.setModel("Any");
        C1.Processor = "i3 8th Gen";
        C1.OS = "Linux";
        System.out.println(C1.marcaModel());
        System.out.println("Mi sistema operativo es: " + C1.OS + ", Tengo " + C1.MemoryRam + " de RAM");

    }
}
