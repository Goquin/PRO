import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero entero positivo: ");
        int num = sc.nextInt();

        while (num <= 0) {
            System.out.print("Numero no valido, introduzca otro: ");
            num = sc.nextInt();
        }

        int digitos = String.valueOf(num).length();

        System.out.println("El numero tiene " + digitos + " cifras.");
    }
}