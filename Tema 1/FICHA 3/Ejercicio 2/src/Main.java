//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero entero: ");
        int x = sc.nextInt();

        double y = pow(x, 2);

        System.out.println("El valor de la potencia es de: " + pow( x, 2));
        System.out.println("El valor de la potencia es de: " + y);
    }
}