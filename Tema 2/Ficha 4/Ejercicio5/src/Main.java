import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        if ((num1%10) == (num2%10)) {
            System.out.println("La unidad coincide");
        } else {
            System.out.println("No coincide");
        }
    }
}