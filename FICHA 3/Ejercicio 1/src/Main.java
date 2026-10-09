//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero entero: ");
        int x = sc.nextInt();

        System.out.println("Introduzca otro numero entero: ");
        int y = sc.nextInt();

        System.out.println("Los numeros introducios son: " +  x + " y " + y);
    }
}