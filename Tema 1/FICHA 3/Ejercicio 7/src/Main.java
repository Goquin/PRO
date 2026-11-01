//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.println("Introduzca su altura en metros: ");
        double alt = sc.nextDouble();

        double ims = peso / pow(alt, 2);

        System.out.println("Su indice de masa corporal es de: " + ims);
    }
}