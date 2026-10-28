import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();

        int divisor = 1;

        int comparador= 0;

        while (divisor < num) {
            if (num%divisor == 0) {
                comparador = comparador + divisor;
            }

            ++divisor;
        }

        if (comparador == num) {
            System.out.println("El numero es perfecto");
        } else {
            System.out.println("El numero no es perfecto");
        }
    }
}