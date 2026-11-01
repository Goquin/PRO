//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el radio de la esfera: ");
        double r = sc.nextDouble();

        double v = (4 / 3) * PI * pow(r, 3);

        System.out.println("El valor del volumen de la esfera es de: " + v);
    }
}