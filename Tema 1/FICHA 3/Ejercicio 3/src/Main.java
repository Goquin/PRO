//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        int x = sc.nextInt();

        int y = x * 2;
        int z = x * 3;

        System.out.println("El doble de su numero es: " + x*2);
        System.out.println("El doble de su numero es: " + y);
        System.out.println("El triple de su numero es: " + x*3);
        System.out.println("El triple de su numero es: " + z);



    }
}