import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();

        if (num2==0) {
            System.out.println("Error el divisor no puede ser 0");
        } else {
            System.out.println("LA divison vale: " + (num1/num2));
        }

    }
}