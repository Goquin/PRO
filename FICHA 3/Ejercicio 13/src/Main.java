//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero de tres cifras: ");
        int x = sc.nextInt();

        int a = (x /100 );

        System.out.println("La primera cifra del numero es: " + a);

        int b = (x%100)/10;

        System.out.println("La primera cifra del numero es: " + b);

        int c = (x%100)%10;

        System.out.println("La primera cifra del numero es: " + c);
    }
}