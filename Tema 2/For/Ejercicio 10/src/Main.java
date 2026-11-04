import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base (numero real): ");
        double base = sc.nextDouble();

        double res = base;

        System.out.print("Introduzca el exponente (positivo entero): ");
        int exp = sc.nextInt();

        for (int i = 2; i <= exp ; i++) {
            res = res * base;
        }

        System.out.println("El resultado es: " + res);
    }
}