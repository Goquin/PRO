import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int target = (int) (Math.random() * 101);

        int intento;

        System.out.print("Introduzca un numero entre 0 y 100: ");
        intento = sc.nextInt();

        do {
            if (target < intento) {
                System.out.println("Te has pasado, prueba de nuevo");
                System.out.print("Introduzca un numero entre 0 y " + intento+ ": ");
            } else if (intento < target) {
                System.out.println("Te has quedado corto, prueba de nuevo");
                System.out.print("Introduzca un numero entre " + intento + " y 100: ");
            }
            intento = sc.nextInt();
        } while (intento != target);

        System.out.println("Has adivinado correctamente:");
    }
}