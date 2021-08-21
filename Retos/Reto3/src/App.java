public class App {
    public static void main(String[] args) throws Exception {
        SchoolGradingSystem group = new SchoolGradingSystem();
        group.loadData();
        System.out.printf("%.2f %n", group.stat1());
        System.out.println(group.stat2());
        System.out.println(group.stat3());
        System.out.println(group.stat4());
    }
}
