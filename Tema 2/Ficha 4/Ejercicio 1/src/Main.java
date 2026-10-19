import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Escriba el segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es el mayor.");
        }
        else if (num1<num2)
        {
            System.out.println("El numero " + num2 + " es el mayor.");
        }
        else
        {
            System.out.println("Son iguales.");
        }


    }
}