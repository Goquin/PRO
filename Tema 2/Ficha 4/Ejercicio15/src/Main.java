import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero de tres cifras: ");
        int num = sc.nextInt();

        int centena = num/100;

        int unidad = num%10;

        if (centena == unidad) {
            System.out.println("El número es capicua.");
        } else {
            System.out.println("El numero no es capicua.");
        }
    }
}