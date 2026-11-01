import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        if ((num1 != 0) && (num2 !=0)) {
            if (num1>num2) {
                int division = num1/num2;
                System.out.println("La division vale: " + division);
            } else {
                int division = num2 / num1;
                System.out.println("La division vale: " + division);
            }
        }else System.out.println("El divisor es 0.");
    }
}