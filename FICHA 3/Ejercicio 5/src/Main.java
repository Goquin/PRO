//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzaca la intensidad: ");
        double i = sc.nextDouble();

        System.out.println("Introduzaca la recistencia: ");
        double r = sc.nextDouble();

        double v = i * r;

        System.out.println("El voltaje tiene un valor de: " + v);
        System.out.println("El voltaje tiene un valor de: " + (i * r));
    }
}