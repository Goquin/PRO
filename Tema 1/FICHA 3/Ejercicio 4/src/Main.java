//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza un numero: ");
        double x = sc.nextDouble();

        double y = sqrt(x);

        System.out.println("La raiz cuadrada de su numero es: " + sqrt(x));
        System.out.println("La raiz cuadrada de su numero es: " + y);
    }
}