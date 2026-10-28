import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();

        int conteo = 0;

        while (num != -1) {
            System.out.print("Introduzca un numero: ");
            num = sc.nextInt();

            ++conteo;
        }

        System.out.println("Ha introducido " + conteo + " numeros.");
    }
}