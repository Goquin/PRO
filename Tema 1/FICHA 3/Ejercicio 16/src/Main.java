//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzaca L1: ");
        double l1 = sc.nextDouble();

        System.out.println("Introduzaca L2: ");
        double l2 = sc.nextDouble();

        System.out.println("Introduzaca L3: ");
        double l3 = sc.nextDouble();

        double sp = (l1 + l2 + l3) / 2;

        double area = sqrt(sp*(sp-l1)*(sp-l2)*(sp-l3));

        System.out.println("El area del triangulo es de: " + area);

    }
}