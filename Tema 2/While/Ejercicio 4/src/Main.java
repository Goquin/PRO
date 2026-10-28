import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();

        int numerosAcabados = 0;

        if (num%10 == 2) {
           ++numerosAcabados;
        }

        while (num>=0) {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            if (num%10 == 2) {
                ++numerosAcabados;
            }
        }

        System.out.println("El total de numeros acabados en dos es : " + numerosAcabados);
    }
}