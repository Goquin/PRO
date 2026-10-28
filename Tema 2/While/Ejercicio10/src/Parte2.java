import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do {

            System.out.print("Introduzca un numero entero: ");
            num = sc.nextInt();

            if (num > 0) {
                System.out.println("Es positivo");
            } else {
                System.out.println("Es negativo");
            }

            if (num % 2 == 0) {
                System.out.println("Es par");

            } else System.out.println("Es impar");
        }  while ( num != 0) ;
    }
}
