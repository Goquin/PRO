//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la medida de el cateto a: ");
        double a = sc.nextDouble();
        System.out.println("Introduzca la medida de el cateto b: ");
        double b = sc.nextDouble();

        double h = sqrt((pow(a,2) + pow(b,2)));

        System.out.println("El valor de la hipotenusa es de: " + h);

    }
}