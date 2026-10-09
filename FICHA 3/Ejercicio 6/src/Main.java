//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la temperatura en grados celcius: ");
        double tc = sc.nextDouble();

        double tf = 32 + (9 * tc / 5);

        System.out.println("La temperatura en fahrenheit es de: " + tf);
    }
}