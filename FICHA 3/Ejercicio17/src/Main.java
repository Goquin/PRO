//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el dia de su cumpleaños: ");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes de su cumpleaños: ");
        int mes = sc.nextInt();
        System.out.println("Introduzca el año de su cumpleaños: ");
        int año = sc.nextInt();

        int y = dia + mes + año;

        int a = y/1000;
        int b = (y%1000)/100;
        int c = ((y%1000)%100)/10;
        int d = ((y%1000)%100)%10;

        int numSuerte = a+ b + c + d;

        System.out.println("El numero de la suerte sera el: " + numSuerte);

    }
}