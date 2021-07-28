import java.util.*;

public abstract class Operaciones {
protected int num1, num2, num3;
    Scanner input = new Scanner(System.in);
    public void perdirDatos() {
        System.out.print("Digite numero 1: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Digite numero 2: ");
        num2 = Integer.parseInt(input.nextLine());

    }
    public abstract void operacion();

    public int mostrarResultado() {
        return num3;
    }
}
