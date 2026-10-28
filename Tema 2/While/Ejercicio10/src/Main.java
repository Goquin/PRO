import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero: ");
        int num = sc.nextInt();

        if (num>0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

        if (num%2 == 0) {
            System.out.println("Es par");

        } else System.out.println("Es impar");

        while ( num != 0) {
            System.out.print("Introduzca un numero entero: ");
            num = sc.nextInt();

            if (num>0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            if (num%2 == 0) {
                System.out.println("Es par");

            } else System.out.println("Es impar");
        }
    }

}