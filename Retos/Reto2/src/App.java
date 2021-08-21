public class App {
    public static void main(String[] args) throws Exception {
        SchoolGradingSystem group = new SchoolGradingSystem();
        group.readData();
        System.out.printf("%.2f %n", group.question1());
        System.out.println(group.question2());
        System.out.println(group.question3());
        System.out.println(group.question4());
    }
}
